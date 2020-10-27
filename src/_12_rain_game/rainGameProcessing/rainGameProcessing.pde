
int y = 100;
int x = (int) random(50,1000);
int score;

void setup()  {
  size(1000, 700);
  
}
void draw()  {
 
  background(#E5FCFB);
   fill(#000000);
    textSize(16);
    text("Score: " + score , 20, 20);
  fill(#407DFC);
  noStroke();
    ellipse(x, y, 20, 20);
    y+=7;
    if(y>700)  {
      y=100;
   x = (int) random(50,1000);
    
    
}
 fill(#BFC0C1);
rect(mouseX, 650, 50, 50);
checkCatch(x);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100 && y > 690)  {
            score++;

         }
        println("Your score is now: " + score);
    }
