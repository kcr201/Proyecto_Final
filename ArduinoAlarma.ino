#define UP 0
#define DOWN 1
const byte pwmLED = 6;
const int minPWM = 0;
const int maxPWM = 255;
byte fadeDirection = UP;
int fadeValue = 0;
byte fadeIncrement = 5;
unsigned long previousFadeMillis;
int fadeInterval = 3;
int ledState = LOW;           
unsigned long previousMillis = 0;      
const long interval = 1000;
int buzzerAlarma=3;
int input;
 
void setup() {
  
  pinMode(3, OUTPUT);//Buzzer Alarma
  pinMode(6, OUTPUT);//Led Rojo Alarma PWM
  pinMode(11, OUTPUT);//Led Rojo
  pinMode(12, OUTPUT);//Led Verde
  pinMode(13, OUTPUT);//Led Azul
  analogWrite(pwmLED, fadeValue);
  Serial.begin(9600); //Se inicia la comunicación serie
  digitalWrite(13, HIGH);
}

void doTheFade(unsigned long thisMillis) {
  if (thisMillis - previousFadeMillis >= fadeInterval) {
    if (fadeDirection == UP) {
      fadeValue = fadeValue + fadeIncrement;  
      if (fadeValue >= maxPWM) {
        fadeValue = maxPWM;
        fadeDirection = DOWN;
      }
    } else {
     
      fadeValue = fadeValue - fadeIncrement;
      if (fadeValue <= minPWM) {
       
        fadeValue = minPWM;
        fadeDirection = UP;
      }
    }
  
    analogWrite(pwmLED, fadeValue);  
 
 
    previousFadeMillis = thisMillis;
  }
}

void loop() {
  
               
  
  if (Serial.available() > 0) 
  {
    
        input = Serial.read();

       
        
        if (input == '0')
        {
          analogWrite(buzzerAlarma, 0);
          digitalWrite(11, LOW);
          digitalWrite(12, LOW);
          digitalWrite(13, HIGH);
             
        }
        
        if (input == '1')
        {
          analogWrite(buzzerAlarma, 0);
          digitalWrite(11, LOW);
          digitalWrite(12, HIGH);
          digitalWrite(13, LOW);
          digitalWrite(6, LOW);
             
        }
        
        if (input == '2')
        {
          digitalWrite(11, HIGH);
          digitalWrite(12, LOW);
          digitalWrite(13, LOW);   
        }
    
    
        if (input == '3')
        {
          analogWrite(buzzerAlarma, 150);
          digitalWrite(13, LOW);
          
             while(true)  
               {    
                  
                 unsigned long currentMillis = millis();
                 doTheFade(currentMillis);
                  
                      
                       int contra = Serial.read();

                          if(contra=='1')
                          {
                             analogWrite(buzzerAlarma, 0);
                             digitalWrite(11, LOW);
                             digitalWrite(12, LOW);
                             digitalWrite(13, HIGH);
                             digitalWrite(6, LOW);
                             break;
                          }
                          

                          
               }
         
        } 
  }
}
