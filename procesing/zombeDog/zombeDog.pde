void setup(){
PImage face = loadImage("pippee.jpg");
size(1000,685);
image(face,0,0);



}
void draw(){
fill(mouseX,mouseY,0);
ellipse(359,230,100,100);
ellipse(510,230,100,100);
fill(mouseX,0,mouseY);
ellipse(359,230,10,90);
ellipse(510,230,10,90);





}