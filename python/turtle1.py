from turtle import*
import colorsys
bgcolor ('black')
tracer (100)
pensize(3)

h=0

goto(100,0)
for i in range(400):
    c=colorsys.hsv_to_rgb(h,1,1)
    h+=0.005
    pencolor(c)
    begin_fill()
    left(119)
    forward(400-i)
    circle(-20,-150)
    forward(400-i)
    circle(-10)

done