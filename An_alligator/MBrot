public void MBrot()
    {
        float epsilon = 0.0001; // The step size across the X and Y axis
        float x;
        float y;
        int maxIterations = 10; // increasing this will give you a more detailed fractal
        int maxColors = 256; // Change as appropriate for your display.

        Complex Z;
        Complex C;
        int iterations;
        for(x=-2; x<=2; x+= epsilon)
        {
            for(y=-2; y<=2; y+= epsilon)
            {
                iterations = 0;
                C = new Complex(x, y);
                Z = new Complex(0,0);
                while(Complex.Abs(Z) < 2 && iterations < maxIterations)
                {
                    Z = Z*Z + C;
                    iterations++;
                }
                Screen.Plot(x,y, maxColors % iterations); // depending on the number of iterations, color a pixel.
            }
        }
    }