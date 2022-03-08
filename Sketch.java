import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {
  
    Random rand = new Random();

    // Width and Height
    float width = 800f;
    float height = 700f;

    // Scale Factor
    float wScaleF = width / 400f;
    float hScaleF = height / 400f;

  public void settings() {
    size((int)width, (int)height);
  }

  public void setup() {
    background(179, 166, 166);
    noLoop() ;
  }

  public void draw() {

    // Sunset Sky
    fill(251,144,98);
    rect(0f, 0f, width, 230f * hScaleF);

    // House
    fill(255, 204, 51);
    rect(170f * wScaleF, 220 * hScaleF, 70 * wScaleF, 45 * hScaleF);

    // House Roof
    fill(51, 0, 0);
    triangle(170 * wScaleF, 220 * hScaleF, 205 * wScaleF, 195 * hScaleF, 240 * wScaleF, 220 * hScaleF);

    // House Windows
    fill(255, 255, 255);
    rect(180 * wScaleF, 230 * hScaleF, 10 * wScaleF, 12 * hScaleF);
    rect(220 * wScaleF, 230 * hScaleF, 10 * wScaleF, 12 * hScaleF);

    // House Door 
    fill(153, 102, 0);
    rect(200 * wScaleF, 245 * hScaleF, 10 * wScaleF, 18 * hScaleF);

    // Sun 
    fill(255, 255, 0);
    ellipse(rand.nextInt((int)width), (rand.nextInt((int)(150f * hScaleF))), 80 * wScaleF, 80 * hScaleF);

    // Date
    fill(0, 0, 0);
    text(year() + "-" + month() + "-" + day(), 0, height);

  }
    
}