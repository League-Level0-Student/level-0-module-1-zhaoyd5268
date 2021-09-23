PImage face;
void setup() {
size (700, 500);
face = loadImage("shutterstock1078303643jpg.jpeg");
face.resize(width,height);
}


void draw() {
image(face, 0, 0);
fill (mouseY, mouseX, 66);
ellipse(320,240,100,100);
ellipse(480,240,100,100);
fill (0, 0, 0);
ellipse(320,240,20,20);
ellipse(480, 240, 20, 20);
}
