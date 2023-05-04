# import colorsys
from turtle import bgcolor, circle, color, done, forward, hideturtle, right, speed
# from turtlehideturtle, 
#  importdone, 

bgcolor('black')
speed(0)
hideturtle()
for i in range(120):
    color('red')
    circle(i)
    color('orange')
    circle(i*0.8)
    right(3)
    forward(3)
done
