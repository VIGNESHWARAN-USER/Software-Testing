"use strict";
var Direction;
(function (Direction) {
    Direction[Direction["up"] = 0] = "up";
    Direction[Direction["down"] = 1] = "down";
    Direction[Direction["right"] = 2] = "right";
    Direction[Direction["left"] = 3] = "left";
})(Direction || (Direction = {}));
console.log(Direction['right']);
