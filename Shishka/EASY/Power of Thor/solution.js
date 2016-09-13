/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

var inputs = readline().split(' ');
var lightX = parseInt(inputs[0]); // the X position of the light of power
var lightY = parseInt(inputs[1]); // the Y position of the light of power
var initialTX = parseInt(inputs[2]); // Thor's starting X position
var initialTY = parseInt(inputs[3]); // Thor's starting Y position

var dX = lightX-initialTX,dY = lightY-initialTY;
// game loop
while (true) {
    var remainingTurns = parseInt(readline());
    var go = '';
    if (dY!=0){
        go+=dY>0?'S':'N';
        dY+=dY>0?-1:1;
    }
    if (dX!=0){
        go+=dX>0?'E':'W';
        dX+=dX>0?-1:1;
    }
    print(go);
}