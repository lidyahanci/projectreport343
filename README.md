IE343 PROJECT REPORT
Aslı Günay - Lidya Hancı

Introduction:
Simulated annealing is a method that is probabilistically used to solve
problems with optimization. It is shaped by the actual process of metal
annealing and uses an annealing plan to investigate a large variety of possible
approaches. We will look at a Java application of the simulation-based
annealing approach for addressing the Knapsack Problem in this paper.

Problem Identification:
The Knapsack Problem is choosing a group of objects with specific values and
weights in order to maximize the overall worth while not surpassing a specific
weight limitation. The aim is to discover the best balance of objects that can
be accommodated inside the capacity of the knapsack.

Overview of the Algorithm

Define the problem in question:
Specify the objective function that needs to be optimized as well as the
boundaries that must be met. The goal function in the Knapsack Problem is to
maximize the overall value of the item chosen while making sure their
combined weight exceeds the weight limit of the knapsack.
Start concentrating on the solution:
Begin with a starting point which meets the constraints. Various techniques, for instance a greedy algorithm that picks things depending upon their value-
weight ratios, can be used to generate the initial respond.

Set the starting temperature:
Choose an initial setting that allows for research while preventing accept
inadequate solutions too frequently. During the search, the temperature
affects the chance of adopting less desirable answers. A greater temperature
promotes greater investigation, whereas a lower temperature promotes
extraction and closure.

Establish a cooling schedule:
Create a cooling timetable that steadily lowers the temperature as time goes
on. Cooling cycles could be either exponential, linear,or rely on other
methods. During the search, it manages the exploration-exploitation trade-off.

Set the neighborhood function as follows:
Create a function that, like the present solution, creates nearby solutions. The
neighborhood function controls the way the procedure searches a given space
by introducing little variations in the present answer. In the instance that
involves the Knapsack Problem, the neighborhood function may choose one
item at random and whether include it or eliminate it based on what is left in
capacity.

Select a stopping criterion:
Specify an ending circumstance, which could include a maximum amount of
repetitions or an objective function boundary. This guarantees that the
procedure ends at a specific amount of iterations or as if an acceptable
solution is discovered.

Putting the algorithm into action:
Repeat step over the temperature plan and neighborhood function that you've
established. Create solutions, select superior options, and reject less
successful ones with the likelihood that depends on the temperature and level
of deterioration. As the temperature drops, the likelihood of accepting inferior
answers reduces, preferring better alternatives.
After completing the loop, print the best answer discovered during each
iteration. This answer reflects the set of items that produces the maximum
overall value while remaining in the capacity of the knapsack.

The Metropolis Criteria:
The Metropolis criteria plays an important role in the simulated annealing
approach. On the basis of the variation in objective function parameters and
the present temperature, it decides either to accept or deny an alternative.
The new solution is always approved if it enhances the objective value. Once
the new solution degrades the goal value, it gets approved with a probability
depending on the temperature and degree of the degrade. As the temperature
drops, the acceptance probability lowers, preferring better answers.

The Neighborhood Function:
By making little adjustments to the present solution, the neighborhood function
creates surrounding solutions. With the present setup, the neighborhood
algorithm picks an item at random and either adds or eliminates it from the
knapsack. The option selected is dependent on the knapsack's remaining
space. This method enables us the investigation of neighboring alternatives
within the process of searching space.

The Optimality Gap:
Against examine the accuracy of the approach's outcomes, solutions must be
compared against existing optimal values. The optimality gap is the variance
that exists between the algorithm's objective value and what is considered to

be optimal. We can analyze the algorithm's performance and determine
whether additional changes are required through investigating this gap.
Execution Time and Problem Size:
The simulated annealing algorithm's time of operation is projected to rise as
the problem size grows. This is the case due to the fact that the problem size
grows more extensive, the algorithm has to assess a greater number of
possibilities and explore a broader solution space. The duration complexity of
simulated annealing often increases with the size of the problem at hand. As a
result, you'd expect a positive relationship among problem scale and time to
resolution.

Temperature Range and Algorithm Execution Time:
The temperature spectrum has little impact on the algorithms's time of
execution. Both the cooling timeline and the amount of iterations that's needed
for the approach to converge are determined by the temperature range. A
broader range of temperatures allows for greater exploration in the early
phases of the algorithm, which results in an extended duration of execution. A
narrower temperature range, on the other hand, would concentrate on looking
for on exploitation and converge more rapidly, resulting in a shorter execution
time.

Temperature Range Influences Solution Quality:
The temperature range influences the final solution performance obtained
through the simulated annealing approach. In the initial stages, a wider
temperature range enables the algorithm to investigate a greater range of
alternatives, including possibly inferior solutions. The following may improve
the probability of reaching a global optimum, particularly for complex
problems. Whenever the temperature spectrum gets too wide, the procedure
could require too long to meet, leading to a poor solution. A narrower
temperature range, on the opposite hand, concentrates on seeking on
exploitation, resulting in faster convergence but the possibility of being caught
in local optima.

Conclusion
Simulated annealing is an extremely effective approach for tackling
optimization problems such as the Knapsack Problem. This report's Java
implementation highlights the important processes in the method, such as the
initialization process, cooling, neighbor solution creation, and the Metropolis
criteria. It is feasible to find solutions of outstanding quality by carefully
establishing the algorithm's variables, especially the beginning temperature
and cooling time frame, and utilizing a successful neighborhood function that
examines adjacent answers.

The simulated annealing algorithm's time required for execution is projected to
rise while the problem complexity rises. When the problem's size grows, the
algorithm must assess more alternatives and investigate a bigger search
space, resulting in an extended processing time. When applying the technique
to bigger cases of the Knapsack problem, is critical to keep the connection
between the size of the problem and execution time in mind.
The temperature range has an immediate effect with regard to the duration of
execution and the overall performance of the solution. A larger temperature
range enables greater investigation in the algorithm's early phases, allowing it
to study a wider range of options, including possibly worse answers. This can
enhance the likelihood of achieving a global optimum, particularly for
complicated issues. But when the temperature variation is too broad, the
method might require slower for it to converge, leading to a less satisfactory
answer. A shorter temperature range, on the opposite hand, concentrates on
exploitation and converges faster, although additionally carries the danger of
getting trapped in local optima.
To evaluate the algorithm's performance and lead future developments, it is
critical to contrast the produced answers with existing optimal and measure
the optimality gap. The optimality gap is the distinction between an algorithm's
objective value and the value that is optimal. By studying this gap, we can
figure out the proximity the algorithm's answers are to the optimal solutions
and suggest possibilities for improvement.
Finally, the simulated annealing procedure is a reliable method for tackling
challenges with optimization such as the Knapsack Problem. Superior results
may be produced through following the algorithm's major phases,
appropriately configuring its variables, and applying an efficient neighborhood
function. While establishing the range of temperatures, it is crucial to take into
account the influence of the problem's scope on time to completion as well as
the trade-off among exploration and exploitation. By evaluating the algorithm's
results with existing optimum solutions, we may evaluate its performance and
suggest areas for improved performance.
