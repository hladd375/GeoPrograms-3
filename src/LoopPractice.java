public class LoopPractice extends World {

    public void go(){
        plane.pausetime = 0;
        for(int x=0;x<=10;x=x+1){
            DrawRandomShape();
        }



    }
    public void DrawRandomShape(){
        int random = plane.random(0,3);

        if(random == 0){
            for (int x=1;x<=5; x=x+1){
                System.out.println(random);
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
                plane.square(100);

            }
        }
        if(random == 1){
            for (int x=0;x<=5; x=x+1){
                System.out.println(random);
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
                plane.house(100);
            }


        }
        if(random == 2){
            for (int x=0;x<=5; x=x+1){
                System.out.println(random);
                plane.teleport(plane.random(0,1000),plane.random(0,800));
                plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
                plane.fillCircle(100);
            }


        }
    }

}
