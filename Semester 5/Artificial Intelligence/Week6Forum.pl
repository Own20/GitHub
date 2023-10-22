# A *right triangle* is a triangle in which one angle is equal to 90 degrees.
# It is known that the sum of all angles in any triagle is 180 degrees.
# Assume that the sum of two angles in a given triangle is 90 degrees.
# Write a Prolog program that shows that this is the *right triangle*.

triangle(Angle1, Angle2, Angle3) :-
    % Check sum all angles is 180 degrees
    TotalAngle is Angle1 + Angle2 + Angle3,
    TotalAngle =:= 180,
    
    % Check one of the angles is 90 degrees
    (Angle1 =:= 90 ; Angle2 =:= 90 ; Angle3 =:= 90),
    
    % Conditions fulfilled, print a message
    write('This is a triangle.').

triangle(_, _, _) :-
    % Conditions NOT fulfilled, print a message
    write('This is NOT a triangle.').