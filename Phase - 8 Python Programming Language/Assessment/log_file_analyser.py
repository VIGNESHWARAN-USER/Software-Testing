import re

with open("server_log.txt", 'r') as logfile:
    logContent = logfile.read()

    lines = len(logContent.split("\n"))
    words = len(logContent.split(" "))
    chars = len(re.findall(r"[^0-9]|[0-9]", logContent))
    info = re.findall(r"\[INFO\].*-.*\n", logContent)
    error = re.findall(r"\[ERROR\].*-.*\n", logContent)
    critical = re.findall(r"\[CRITICAL\].*-.*\n", logContent)
    warning = re.findall(r"\[WARNING\].*-.*\n", logContent)

    print(f"Total Lines : {lines}")
    print(f"Total Words : {words}")
    print(f"Total Characters : {chars}")
    print(f"INFO: {len(info)} | WARNING: {len(warning)} | ERROR: {len(error)} | CRITICAL: {len(critical)} |")
    print("---- ALERTS ----")
    for log in error:
        print(log, end="")
    for log in critical:
            print(log, end="")
