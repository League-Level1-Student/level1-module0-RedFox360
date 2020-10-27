  import ddf.minim.*; 
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
PImage pictureOfRecord;
int angle;
void setup()  {
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("windowsXPErrorSound.wav", 512);   //in the setup method
  size(300, 300);
  pictureOfRecord = loadImage("spinningRecord.png");
pictureOfRecord.resize(300, 300);
}
void draw()  {
 
   angle += 20;
  rotateImage(pictureOfRecord, angle);
   image(pictureOfRecord, 0, 0);
}
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
    
          //at the very top of your sketch
  
  
