
# from booklist to abstract

prompts = ['pls. enter no.: ',
          'pls. enter title: ',
          'pls. enter genre: ',
          'pls. enter author: ',
          'pls. enter Publ: ',
          'pls. enter Price: ']

col_widths = [6, 15, 6, 15, 6, 8]

_list = []
while True:
    sublist =[]
    for i in range(len(prompts)):
        item = input(prompts[i])
        if item == 'quit()':
            break
        sublist.append(item)
    if item == 'quit()':
        break

    _list.append(sublist)

for sublist in _list:
    line = f""
    for index in range(len(sublist)):
        line += f"{sublist[index]:{col_widths[index]}}"
    print(line)
print(type(_list))



