The goal of this project is to:

Compute the score for a completed bowling game and for intermediate frames as well.

1. The score for a frame is the total number of pins knocked down, plus any bonuses from strikes or spares.

- A spare is when all 10 pins are knocked down in 2 tries in a frame (6,4) for example. The next roll's pin count will be added to this frame. For example in Frame 1 (6,4) is rolled on the next roll 7 pins are knocked down. Frame 1's score will be 17.

- A Strike is when all 10 pins are knocked down on the first try (10,0). (0,10) is a spare.  The bonus for a strike is the value of the next 2 rolls. 

2. The tenth frame is a unique frame.  If a strike or spare is rolled, the player is allowed to roll extra balls to complete the frame.  However a maximum of 3 balls can be rolled.
