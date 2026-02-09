public class bob implements Runnable{
    private String color;
    private int x,y;
    public bob(String color,int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
   }
   public void run(){
        Turtle bob = new Turtle(x,y);
        bob.penColor(color);
        bob.speed(20);

       bob.penColor("green");
       bob.speed(2);
       bob.width(80);
       //Leaves
       bob.left(240);
       bob.forward(150);
       bob.up();
       bob.setPosition(x,y,0);
       bob.down();
       bob.forward(150);
       bob.setPosition(x,y,0);
       bob.left(120);
       bob.forward(150);
       bob.setPosition(x,y,0);

       bob.width(10);
       bob.left(90);
       bob.forward(30);
       bob.right(90);
       bob.forward(5);
       bob.speed(0.1);

       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.right(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }
       }

       bob.right(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.left(1);
           bob.forward(0.5);
           bob.up();
       }

       bob.setPosition(x,y,0);


       bob.right(90);
       bob.forward(30);
       bob.left(90);
       bob.forward(5);


       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.left(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }
       }
       bob.left(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.right(1);
           bob.forward(0.5);
           bob.up();
       }

       //Leaves 2
       bob.setPosition(x,y,0);
       bob.left(120);
       bob.right(90);
       bob.forward(30);
       bob.left(90);
       bob.forward(5);


       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.left(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }
       }
       bob.left(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.right(1);
           bob.forward(0.5);
           bob.up();
       }

       bob.setPosition(x,y,0);
       bob.left(120);
       bob.width(10);
       bob.left(90);
       bob.forward(30);
       bob.right(90);
       bob.forward(5);



       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.right(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }
       }

       bob.right(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.left(1);
           bob.forward(0.5);
           bob.up();
       }
       //Leaves 3
       bob.setPosition(x,y,0);
       bob.left(240);
       bob.width(10);
       bob.left(90);
       bob.forward(30);
       bob.right(90);
       bob.forward(5);



       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.right(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.left(1);
               bob.forward(0.5);
               bob.up();
           }
       }

       bob.right(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.left(1);
           bob.forward(0.5);
           bob.up();
       }

       bob.setPosition(x,y,0);
       bob.left(240);
       bob.right(90);
       bob.forward(30);
       bob.left(90);
       bob.forward(5);


       for(int j = 0; j<3;j++ ) {
           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }

           bob.left(180);

           for (int i = 0; i < 90; ++i) {
               bob.down();
               bob.right(1);
               bob.forward(0.5);
               bob.up();
           }
       }
       bob.left(90);

       for(int i = 0; i < 90; ++i) {
           bob.down();
           bob.right(1);
           bob.forward(0.5);
           bob.up();
       }
       //HOLLY
       bob.setPosition(x,y,0);
       bob.forward(40);
       bob.dot(color,70);
       bob.up();
       bob.setPosition(x,y,0);
       bob.left(120);
       bob.forward(40);
       bob.dot(color,70);
       bob.up();
       bob.setPosition(x,y,0);
       bob.left(240);
       bob.forward(40);
       bob.dot(color,70);
    }
}
