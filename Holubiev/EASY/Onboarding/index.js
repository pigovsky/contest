while (true) {
  var enemy1Name = readline();
  var enemy1Distance = parseInt(readline());
  var enemy2Name = readline();
  var enemy2Distance = parseInt(readline());

  if (enemy1Distance < enemy2Distance) {
    print(enemy1Name);
  } else {
    print(enemy2Name);
  }
}
