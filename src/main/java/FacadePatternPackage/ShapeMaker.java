package FacadePatternPackage;

public class ShapeMaker {

	private Shape circleObj;
	private Shape squareObj;
	private Shape rectangleObj;

	ShapeMaker()
	{
		
		
		circleObj= new Circle();
		squareObj= new Square();
		rectangleObj= new Rectangle();
		
	}
	
	void drawCircle()
	{
		
		circleObj.draw();
		
	}
void drawSquare()
{
	
squareObj.draw();
}

void drawRectangle()
{
rectangleObj.draw();	

}
	
	
	
}
