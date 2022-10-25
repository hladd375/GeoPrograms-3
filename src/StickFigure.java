public class StickFigure extends World{
    public int red;
    public int blue;
    public int green;



    public void go(){
        plane.showBackGround();
        plane.isTrail = true;
        plane.pausetime = (0);
        BasicStickFigure();
        shirtChoice();
        pantChoice();
        hatChoice();
        backgroundcolorchange();






    }
    public void backgroundcolorchange(){
        for (int row = 0; row < 1000; row = row + 1) {
            for (int col = 0; col < 333; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor(200, green, blue);
                }

            }
        for (int row = 0; row < 1000; row = row + 1) {
            for (int col = 666; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor(red, 20, blue);
            }

        }
        for (int row = 590; row < 1000; row = row + 1) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor(50, 50, 50);
            }

        }
        }




    public void hatChoice(){
        int shirt = plane.random(1,4);
        if (shirt == 1){
            hatoption1();
        }
        if (shirt == 2){
            hatoption2();
        }
        if (shirt == 3){
            hatoption3();
        }

    }
    public void hatoption1(){
        plane.setColor(200,20,20);
        plane.teleport(500,100);
        triangle(100);
        plane.startingAngle(90);
        plane.move(20);
        triangle(80);
        plane.startingAngle(90);
        plane.move(20);
        triangle(60);
        plane.startingAngle(90);
        plane.move(20);
        triangle(40);


    }
    public void hatoption2(){
        plane.startingAngle(0);
        plane.setColor(20,20,20);
        plane.teleport(460,180);
        rectangle(80,10);
        plane.move(20);
        plane.square(40);
        plane.move(10);
        plane.square(20);


    }
    public void hatoption3(){
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.teleport(555,200);
        plane.startingAngle(270);
        plane.trailWidth=20;
        for(int x=0;x<=91;x=x+1){
            plane.turn(2);
            plane.move(1);

        }
        plane.trailWidth=20;
        plane.startingAngle(0);
        plane.move(170);
        plane.startingAngle(180);
        plane.teleport(545,190);
        plane.move(100);
        plane.teleport(535,180);
        plane.move(80);
        plane.teleport(525,170);
        plane.move(60);
        plane.teleport(515,160);
        plane.move(40);



    }
    public void rectangle(int a, int b){
        plane.trailWidth = b*2;
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);

    }
    public void pantChoice(){
        int shirt = plane.random(1,3);
        if (shirt == 1){
            pantoption1();
        }
        if (shirt == 2){
            pantoption2();
        }

    }
    public void pantoption1(){
        plane.teleport(500,500);
        plane.trailWidth = 20;
        plane.setColor(20,20,200);
        brokentriangle(100);

    }
    public void pantoption2(){
        plane.teleport(500,500);
        plane.trailWidth = 20;
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        brokentriangle(50);

    }
    public void shirtChoice(){
        int shirt = plane.random(1,3);
        if (shirt == 1){
            shirtoption1();
        }
        if (shirt == 2){
            shirtoption2();
        }
    }
    public void shirtoption1(){
        plane.teleport(500,325);
        plane.trailWidth = 20;
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.startingAngle(90);
        plane.move(25);
        brokentriangle(100);
        plane.startingAngle(90);
        plane.move(100);

    }
    public void shirtoption2() {
        plane.teleport(500, 325);
        plane.trailWidth = 20;
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.startingAngle(90);
        plane.move(25);
        brokentriangle(50);
        plane.startingAngle(90);
        plane.move(100);
    }
    public void BasicStickFigure(){
        plane.trailWidth=5;
        plane.teleport(500,500);
        plane.startingAngle(270);
        //body
        plane.move(200);
        //head
        circle(2);
        //legs
        plane.teleport(500,500);
        brokentriangle(100);
        //arms
        plane.teleport(500,350);
        brokentriangle(100);

    }
    public void brokentriangle(int a){
        plane.startingAngle(120);
        plane.move(a);
        plane.isTrail=false;
        plane.turn(120);
        plane.move(a);
        plane.isTrail=true;
        plane.turn(120);
        plane.move(a);
        plane.turn(120);

    }
    public void circle(int a){
        plane.startingAngle(0);
        for(int x=0;x<=365;x=x+1){
            plane.move(1);
            plane.turn(a);
        }

    }
    public void triangle(int a){
        plane.startingAngle(120);
        plane.move(a);
        plane.turn(120);
        plane.move(a);
        plane.turn(120);
        plane.move(a);
        plane.turn(120);

    }


}
