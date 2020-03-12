 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
       int x = 250;
       int y = 250;
       int w = 10;
       int h = 10;
       
    void setup() {
      // 2. Set the size of your sketch
    size(500,500);
    }
    
    void draw() {
      // 3. Set the background color of your sketch
      background(#BF7B7B);
      // 4. Draw an ellipse. Make sure it fits in the window.
      ellipse(x, y, w, h);
      // Use the variables created at the top of the sketch, 
      // for the location and size of your ellipse
    
    }
    
    void mousePressed() {
      //5. Create an integer variable called distance
     int distance;
      //6. Set the value of the distance variable to the value returned by the getDistance method
      //   Pass the mouse's x and y (mouseX and mouseY) and the x and y of your ellipse to the method.
        distance = getDistanceFromMouse(x, y);
          
      //7.  Use an if statement to check if the distance variable is < the radius of the ellipse
      //    If it is, set a new x and y for the ellipse, using a random location on the window
      //    Hint: Use the Processing random() function
       if(distance < w){
         x = (int)random(width);
         y = (int)random(height);
       
    }
    }
    int getDistanceFromMouse(int x1, int y1) {
      return (int)Math.sqrt(Math.pow((x1-mouseX),2) + Math.pow((y1-mouseY),2));
    }
