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
  var move = getMove(thorToLightOffset);

  adjustThorPosition(thorToLightOffset);
  print(move);
}

function adjustThorPosition(thorToLightOffset) {
  if (thorToLightOffset.x > 0) {
    thorPosition.x -= 1;
  }
  if (thorToLightOffset.x < 0) {
    thorPosition.x += 1;
  }

  if (thorToLightOffset.y > 0) {
    thorPosition.y -= 1;
  }

  if (thorToLightOffset.y < 0) {
    thorPosition.y += 1;
  }
}

function getThorToLightOffset() {
  return {
    x: thorPosition.x - lightPosition.x,
    y: thorPosition.y - lightPosition.y
  }
}

function getMove(thorToLightOffset) {
  return getYMove(thorToLightOffset) + getXMove(thorToLightOffset);
}

function getYMove(thorToLightOffset) {
  var move = '';

  var thorIsHigher = thorToLightOffset.y < 0;
  if (thorIsHigher) {
    move += 'S';
  }

  var thorIsLower = thorToLightOffset.y > 0;
  if (thorIsLower) {
    move += 'N';
  }

  return move;
}

function getXMove(thorToLightOffset) {
  var move = '';

  var thorIsLeftOf = thorToLightOffset.x < 0;
  if (thorIsLeftOf) {
    move += 'E';
  }

  var thorIsRightOf = thorToLightOffset.x > 0;
  if (thorIsRightOf) {
    move += 'W';
  }

  return move;
}
