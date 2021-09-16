
void setup() {
    size(500,500);
}
void draw() {
  fill  (#D3D18D);
  ellipse ( 300,200,300,300);
  PImage pepperoni;
  PImage mushroom;
  PImage olive;

   pepperoni = loadImage("pepperoni.png");
   mushroom = loadImage("mushroom.png");
   olive = loadImage("olive.png");
if (mousePressed) {
image(pepperoni,200,200);
image(pepperoni,200,100);
image(pepperoni,300,100);
image(pepperoni,300,200);
image(olive,250,75);
image(olive,250,225);
image(mushroom, 250, 155);
}
} 
