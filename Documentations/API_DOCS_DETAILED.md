# LMS Server — Detailed API Documentation

**Base URL:** `https://lms-server-3-wedg.onrender.com`
**Tested on:** 2026-06-17 — every request/response below is **real** (captured live).
**Content-Type:** `application/json`

---

## Authentication

Most routes need a **JWT Bearer token**.

1. Call `POST /user/login` → copy `token` from the response.
2. Send it on protected (🔒) requests:
   ```
   Authorization: Bearer <token>
   ```
- Token valid **2 days**; also set as an httpOnly `token` cookie.
- **Render note:** first call after idle may take 30–60s (cold start) — retry once.

### Test account
| Role | Email | Password |
|------|-------|----------|
| Admin | `sam@gmail.com` | `123` |

---

# Part A — 5 Safe (read-only) APIs

> These only **read** data (plus login). They do not change anything — run them freely.

## 1. Health check — `GET /`
| | |
|---|---|
| **Method / Path** | `GET /` |
| **Auth** | none |
| **Headers** | none |
| **Body** | none |

**Request**
```bash
curl https://lms-server-3-wedg.onrender.com/
```
**Response — 200**
```
API Running
```

---

## 2. Login — `POST /user/login`
| | |
|---|---|
| **Method / Path** | `POST /user/login` |
| **Auth** | none |
| **Headers** | `Content-Type: application/json` |
| **Body (required)** | `email`, `password` |

**Request**
```bash
curl -X POST https://lms-server-3-wedg.onrender.com/user/login \
  -H "Content-Type: application/json" \
  -d '{"email":"sam@gmail.com","password":"123"}'
```
**Request body**
```json
{ "email": "sam@gmail.com", "password": "123" }
```
**Response — 201 (real)**
```json
{
  "message": [{ "key": "success", "value": "Admin logged in successfully" }],
  "user": { "_id": "69c384a66abf6c550fe45f75", "email": "sam@gmail.com", "firstName": "sam",
            "role": { "originalRole": "Admin", "roleValue": "admin" }, "status": "active" },
  "token": "<JWT>",
  "institution": "696e0695d744732a85dabc44",
  "institutionName": "PSG",
  "userId": "69c384a66abf6c550fe45f75"
}
```
**Errors:** unknown email `400 "Email is invalid"` · wrong password `400 "Password is incorrect"` · missing fields `400 "All fields are required"`.

---

## 3. Get all institutions — `GET /getAll/institution`
| | |
|---|---|
| **Method / Path** | `GET /getAll/institution` |
| **Auth** | none |
| **Headers** | none |
| **Body** | none |

**Request**
```bash
curl https://lms-server-3-wedg.onrender.com/getAll/institution
```
**Response — 200 (real)**
```json
{
  "message": [{ "key": "success", "value": "Institution Retrieved successfully" }],
  "getAllInstitution": [
    { "_id": "683d3cd3684c38657962bc9c", "inst_id": "INS001", "inst_name": "SmartCliff",
      "inst_owner": "KNS", "phone": "9876543210", "address": "Coimbatore", "basedOn": "skilling" }
  ]
}
```

---

## 4. Get all roles — `GET /roles/getAll` 🔒
| | |
|---|---|
| **Method / Path** | `GET /roles/getAll` |
| **Auth** | Bearer token |
| **Headers** | `Authorization: Bearer <token>` |
| **Body** | none |

**Request**
```bash
curl https://lms-server-3-wedg.onrender.com/roles/getAll \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "message": [{ "key": "success", "value": "Role Retrieved successfully" }],
  "roles": [
    { "_id": "69c3846b6abf6c550fe45f72", "originalRole": "Admin", "roleValue": "admin" },
    { "_id": "69c384706abf6c550fe45f73", "originalRole": "Student", "roleValue": "Student" },
    { "_id": "69c384756abf6c550fe45f74", "originalRole": "Program Coordinator", "roleValue": "programcoordinator" }
  ]
}
```
**Without token — 401:** `{"message":[{"key":"error","value":"User is not logged in"}]}`

---

## 5. Get all course structures — `GET /courses-structure/getAll` 🔒
| | |
|---|---|
| **Method / Path** | `GET /courses-structure/getAll` |
| **Auth** | Bearer token |
| **Headers** | `Authorization: Bearer <token>` |
| **Body** | none |

**Request**
```bash
curl https://lms-server-3-wedg.onrender.com/courses-structure/getAll \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "message": [{ "key": "success", "value": "Course structures retrieved successfully" }],
  "data": [
    { "_id": "69c4bcd59c7dd1d8f5f92cde", "courseName": "Mern Stack", "courseCode": "APL-BTC-H-001",
      "category": "Software Development", "courseLevel": "Intermediate",
      "institution": "696e0695d744732a85dabc44" }
  ]
}
```

---

# Part B — Notes API (full CRUD)

> ⚠️ Notes are stored **per logged-in user**. Create/Update/Delete **change data**,
> but only on *your own* account's notes — they don't affect other users or system config.
> All 6 operations below were tested live end-to-end (the test note was created and then deleted).
> **All require:** `Authorization: Bearer <token>`.

**Note object fields**
| Field | Type | Default | Notes |
|-------|------|---------|-------|
| `title` | string | `"Untitled Note"` | |
| `content` | string | `""` | |
| `tags` | string[] | `[]` | |
| `isPinned` | boolean | `false` | |
| `color` | string (hex) | `"#ffffff"` | |
| `_id` | string | auto | server-generated |
| `lastEdited` | date | auto | |

---

## 6. Create note — `POST /create/notes` 🔒
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>`, `Content-Type: application/json` |
| **Body (all optional)** | `title`, `content`, `tags`, `isPinned`, `color` |

**Request**
```bash
curl -X POST https://lms-server-3-wedg.onrender.com/create/notes \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{"title":"API Test Note","content":"Created by tester","tags":["qa","demo"],"color":"#ffeb3b","isPinned":false}'
```
**Response — 201 (real)**
```json
{
  "success": true,
  "message": "Note created successfully",
  "data": {
    "title": "API Test Note", "content": "Created by tester",
    "tags": ["qa","demo"], "isPinned": false, "color": "#ffeb3b",
    "lastEdited": "2026-06-17T04:10:19.541Z",
    "_id": "6a321e2bd22ace8c6babeef6",
    "createdAt": "2026-06-17T04:10:19.542Z", "updatedAt": "2026-06-17T04:10:19.542Z"
  }
}
```

---

## 7. Get all notes — `GET /getAll/notes` 🔒
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>` |
| **Query params (optional)** | `page` (1), `limit` (50), `search`, `tags`, `isPinned`, `sortBy` (`lastEdited`/`title`), `sortOrder` (`asc`/`desc`) |

**Request**
```bash
curl "https://lms-server-3-wedg.onrender.com/getAll/notes?limit=2&sortOrder=desc" \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "success": true,
  "data": [
    { "title": "API Test Note", "content": "Created by tester", "tags": ["qa","demo"],
      "isPinned": false, "color": "#ffeb3b", "_id": "6a321e2bd22ace8c6babeef6",
      "lastEdited": "2026-06-17T04:10:19.541Z" }
  ],
  "pagination": { "currentPage": 1, "totalPages": 1, "totalNotes": 1, "hasNext": false, "hasPrev": false }
}
```

---

## 8. Get note by ID — `GET /getById/notes/:id` 🔒
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>` |
| **Path param** | `:id` = note `_id` |

**Request**
```bash
curl https://lms-server-3-wedg.onrender.com/getById/notes/6a321e2bd22ace8c6babeef6 \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "success": true,
  "data": {
    "title": "API Test Note", "content": "Created by tester", "tags": ["qa","demo"],
    "isPinned": false, "color": "#ffeb3b", "_id": "6a321e2bd22ace8c6babeef6",
    "lastEdited": "2026-06-17T04:10:19.541Z"
  }
}
```
**Not found — 404:** `{ "success": false, "message": "Note not found" }`

---

## 9. Update note — `PUT /update/notes/:id` 🔒  *(alters data)*
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>`, `Content-Type: application/json` |
| **Path param** | `:id` = note `_id` |
| **Body (any subset)** | `title`, `content`, `tags`, `isPinned`, `color` |

**Request**
```bash
curl -X PUT https://lms-server-3-wedg.onrender.com/update/notes/6a321e2bd22ace8c6babeef6 \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{"title":"API Test Note (edited)","content":"Updated content"}'
```
**Response — 200 (real)**
```json
{
  "success": true,
  "message": "Note updated successfully",
  "data": {
    "title": "API Test Note (edited)", "content": "Updated content", "tags": ["qa","demo"],
    "isPinned": false, "color": "#ffeb3b", "_id": "6a321e2bd22ace8c6babeef6",
    "lastEdited": "2026-06-17T04:10:24.201Z"
  }
}
```

---

## 10. Toggle pin — `PUT /toggle-pin/notes/:id` 🔒  *(alters data)*
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>` |
| **Path param** | `:id` = note `_id` |
| **Body** | none |

**Request**
```bash
curl -X PUT https://lms-server-3-wedg.onrender.com/toggle-pin/notes/6a321e2bd22ace8c6babeef6 \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "success": true,
  "message": "Note pinned successfully",
  "data": { "title": "API Test Note (edited)", "isPinned": true, "color": "#ffeb3b",
            "_id": "6a321e2bd22ace8c6babeef6", "lastEdited": "2026-06-17T04:10:25.706Z" }
}
```

---

## 11. Delete note — `DELETE /delete/notes/ById/:id` 🔒  *(alters data)*
| | |
|---|---|
| **Headers** | `Authorization: Bearer <token>` |
| **Path** | append the note id after `/ById/`. Multiple ids supported: `/ById/<id1>/<id2>` |
| **Body** | none |

**Request**
```bash
curl -X DELETE https://lms-server-3-wedg.onrender.com/delete/notes/ById/6a321e2bd22ace8c6babeef6 \
  -H "Authorization: Bearer <token>"
```
**Response — 200 (real)**
```json
{
  "success": true,
  "message": "Notes deleted successfully",
  "deletedCount": 1,
  "deletedIds": ["6a321e2bd22ace8c6babeef6"]
}
```
**Invalid id format — 400:** `{ "success": false, "message": "Invalid note ID format" }`

---

## Quick end-to-end test
```bash
# 1. Login → token
TOKEN=$(curl -s -X POST https://lms-server-3-wedg.onrender.com/user/login \
  -H "Content-Type: application/json" \
  -d '{"email":"sam@gmail.com","password":"123"}' | jq -r .token)

# 2. Read-only checks
curl https://lms-server-3-wedg.onrender.com/roles/getAll -H "Authorization: Bearer $TOKEN"
curl https://lms-server-3-wedg.onrender.com/courses-structure/getAll -H "Authorization: Bearer $TOKEN"

# 3. Notes full cycle
NID=$(curl -s -X POST https://lms-server-3-wedg.onrender.com/create/notes \
  -H "Authorization: Bearer $TOKEN" -H "Content-Type: application/json" \
  -d '{"title":"Test","content":"hi"}' | jq -r .data._id)
curl https://lms-server-3-wedg.onrender.com/getById/notes/$NID -H "Authorization: Bearer $TOKEN"
curl -X DELETE https://lms-server-3-wedg.onrender.com/delete/notes/ById/$NID -H "Authorization: Bearer $TOKEN"
```
