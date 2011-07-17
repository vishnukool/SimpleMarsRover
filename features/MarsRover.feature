Feature: Mars Rover Feature
        This is to ensure that the Mars Rover satisfies
        the desired Acceptance criteria for the given inputs.

        Scenario: Rover1 input scenario
                Given the Plateau size is 5 5
                When the Rover position is 1 2 N
                And the Rover command is LMLMLMLMM
                Then the final position is 1 3 N

        Scenario: Rover2 input scenario
                Given the Plateau size is 5 5
                When the Rover position is 3 3 E
                And the Rover command is MMRMMRMRRM
                Then the final position is 5 1 E
