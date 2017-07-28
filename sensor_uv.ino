 int UVOUT = A0; 
int REF_3V3 = A1;
float uvIntensity;
float outputVoltage;
int mensaje;
boolean KEY=false;
int uvLevel;
int refLevel;
int a;
int b;

void setup()
{
  Serial.begin(9600);
  pinMode(UVOUT, INPUT);
  pinMode(REF_3V3, INPUT);
  //Serial.println("ML8511 example");
}

int averageAnalogRead(int pinToRead)
{
  byte numberOfReadings = 8;
  unsigned int runningValue = 0; 
  for(int x = 0 ; x < numberOfReadings ; x++)
  runningValue += analogRead(pinToRead);
  runningValue /= numberOfReadings;
  return(runningValue);  
}
float mapfloat(float x, float in_min, float in_max, float out_min, float out_max)
{
  return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
}


void loop()
{
  if(Serial.available()>0)
  {
    mensaje=Serial.read();
    if(mensaje='1')
    {
      KEY=true;
    }
    else
    {
      KEY=false;
    }
  }

  if(KEY==true)
  {
   uvLevel = averageAnalogRead(UVOUT);
   refLevel = averageAnalogRead(REF_3V3);
   outputVoltage = 3.3 / refLevel * uvLevel;
    
   uvIntensity = mapfloat(outputVoltage, 0.99, 2.8, 0.0, 15.0); //Convert the voltage to a UV intensity level
   uvIntensity = uvIntensity/10;     
   //Serial.print("output: ");
   //Serial.print(refLevel);
   //Serial.print("ML8511 output: ");
   //Serial.print(uvLevel);
   //Serial.print("ML8511 voltage:");
   a=100*outputVoltage;
   outputVoltage=a*1.0/100;
   float c=outputVoltage;
   Serial.println(c);
   Serial.print("0000000");
    b=100*uvIntensity;
   uvIntensity=b*1.0/100;
   float d=uvIntensity;
   Serial.println(d);
   //Serial.println();
   delay(2000);
 }
 
 
}


