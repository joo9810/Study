import sys

N, M = map(int, sys.stdin.readline().split())

word_dict = dict()

for i in range(N): # 최대 O(100000)
    input_word = sys.stdin.readline().rstrip()
    if len(input_word) >= M:
        if input_word in word_dict:
            word_dict[input_word] += 1
        else:
            word_dict[input_word] = 1

# print(word_dict) # {'apple': 2, 'sand': 3, 'append': 1}

sorted_dict = sorted(word_dict.items(), key = lambda x : x[1], reverse=True)
# print(sorted_dict)

freq_dict = dict()
for word, freq in sorted_dict:
    if freq in freq_dict:
        freq_dict[freq].append(word)
    else:
        freq_dict[freq] = [word]

# print(freq_dict)

for freq in sorted(freq_dict, reverse=True):
    if len(freq_dict[freq]) == 1:
        sys.stdout.write(freq_dict[freq][0] + "\n")
    else:
        len_dict = dict()
        for word in freq_dict[freq]:
            length = len(word)
            if length in len_dict:
                len_dict[length].append(word)
            else:
                len_dict[length] = [word]
        
        for length in sorted(len_dict, reverse=True):
            for word in sorted(len_dict[length]):
                sys.stdout.write(word + "\n")