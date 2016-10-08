while (true) {
  var enemy1 = {
    name: readline(),
    distance: parseInt(readline(), 10)
  };
  var enemy2 = {
    name: readline(),
    distance: parseInt(readline(), 10)
  };

  if (enemy1.distance < enemy2.distance) {
    print(enemy1.name);
  } else {
    print(enemy2.name);
  }
}
