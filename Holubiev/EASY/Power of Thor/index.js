var parameters = readline().split(' ');
var lightPosition = {
  x: parseInt(parameters[0], 10),
  y: parseInt(parameters[1], 10)
};
var thorPosition = {
  x: parseInt(parameters[2], 10),
  y: parseInt(parameters[3], 10)
};

while (true) {
  var remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move. Do not remove this line.

  // Write an action using print()
  // To debug: printErr('Debug messages...');

  var thorToLightOffset = getThorToLightOffset();
  var move = calcMove(thorToLightOffset);

  adjustThorPosition(thorToLightOffset);
  print(move);
}

/**
 * Adjust position of Thor base on his offset to light
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 */
function adjustThorPosition(thorToLightOffset) {
  adjustThorPositionX(thorToLightOffset);
  adjustThorPositionY(thorToLightOffset);
}

/**
 * Adjust position of Thor on X axis base on his offset to light
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 */
function adjustThorPositionX(thorToLightOffset) {
  if (thorToLightOffset.x > 0) {
    thorPosition.x -= 1;
  }
  if (thorToLightOffset.x < 0) {
    thorPosition.x += 1;
  }
}

/**
 * Adjust position of Thor on Y axis base on his offset to light
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 */
function adjustThorPositionY(thorToLightOffset) {
  if (thorToLightOffset.y > 0) {
    thorPosition.y -= 1;
  }

  if (thorToLightOffset.y < 0) {
    thorPosition.y += 1;
  }
}

/**
 * Get Thor offset to light source
 * @return {{x: Number, y: Number}}
 */
function getThorToLightOffset() {
  return {
    x: thorPosition.x - lightPosition.x,
    y: thorPosition.y - lightPosition.y
  }
}

/**
 * Calculate Thor move base on his offset to light
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 * @return {String} Thor move in format [N|S|E|W|NE|SE|SW|NW]
 */
function calcMove(thorToLightOffset) {
  return calcMoveY(thorToLightOffset) + calcMoveX(thorToLightOffset);
}

/**
 * Calculate Thor move on Y axis
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 * @return {String} Thor move on Y axis in format [S|N]
 */
function calcMoveY(thorToLightOffset) {
  var thorIsHigher = thorToLightOffset.y < 0;
  if (thorIsHigher) {
    return 'S';
  }

  var thorIsLower = thorToLightOffset.y > 0;
  if (thorIsLower) {
    return 'N';
  }

  return '';
}

/**
 * Calculate Thor move on X axis
 * @param {Object} thorToLightOffset
 * @param {Number} thorToLightOffset.x
 * @param {Number} thorToLightOffset.y
 * @return {String} Thor move on X axis in format [E|W]
 */
function calcMoveX(thorToLightOffset) {
  var thorIsLeftOf = thorToLightOffset.x < 0;
  if (thorIsLeftOf) {
    return 'E';
  }

  var thorIsRightOf = thorToLightOffset.x > 0;
  if (thorIsRightOf) {
    return 'W';
  }

  return '';
}
