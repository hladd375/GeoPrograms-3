public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime = 0;
        plane.trailWidth = 4;
        grid();
        //randomCity();



    }
    public void grid() {
        for(int y=0;y<=30;y=y+1){

            prettysquarerow(y,30);



        }
    }
    public void prettysquarerow(int y,int z) {
        for(int x=0;x<=40;x=x+1)
        {
            //System.out.println(x);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.teleport(x*(z+10),y*(z+10));
            plane.square(z);



        }
    }
    public void randomCity() {
       //how many houses
       house(7);
       //color of the sun
       sun(255,255,10);
    }
    public void sun(int a, int b, int c){
        plane.trailWidth = 20;
        plane.teleport(150,200);
        plane.setColor(a,b,c);
        for(int x=0;x<=360;x=x+1){
            plane.move(2);
            plane.turn(2);
        }
    }
    public void house(int b){
        for(int x=0;x<=b;x=x+1){
            plane.teleport(x*150, 600);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.startingAngle(0);
            square(100);
            triangle(100);
        }


    }
    public void square(int a){
        plane.move(a);
        plane.turn(270);
        plane.move(a);
        plane.turn(270);
        plane.move(a);
        plane.turn(270);
        plane.move(a);
        plane.turn(270);
    }
    public void triangle(int a){
        plane.startingAngle(0);
        plane.move(a);
        plane.turn(120);
        plane.move(a);
        plane.turn(120);
        plane.move(a);
        plane.turn(120);

    }
}
