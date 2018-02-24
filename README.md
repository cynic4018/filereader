# Input-Output Tasks
by Katapon Sinpuyawong

I ran the tasks on LENOVO Legion Y520 laptop with 2.81Ghz i7-7700HQ,
and got these results:

Task                                               | Time            |
---------------------------------------------------------------------:
Read file 1-char at a time to String               | 0.078262 sec    |
Read file 1-char at a time to StringBuilder        | 0.002084 sec    |
Read file line at a time using BufferedReader      | 0.001855 sec    |

From these result when reading Alice-in-Wonderland.txt using FileReader, append to String. Read 11586 chars in 0.078262 sec. 
Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder. Read 11586 chars in 0.002084 sec. 
Reading Alice-in-Wonderland.txt using BufferedReader, append lines to String. Read 11396 chars in 0.001855 sec.

Summary,The FileReader append to String and append to StringBuilder that use same logic by reading 1-char
But, different is FileReader append to String that slower than FileReader append to StringBuiler(You can see by elapsed time).
The BufferedReader append to String that use other logic by reading line and BufferedReader can reading faster than FileReader
Because logic that reading line instead reading 1-char.
