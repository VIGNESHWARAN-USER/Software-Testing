my_dict = dict(id = 1, name = 'Vigneshwaran', age= 21, list = [1, 2, 3], dict = {'name':"ABC", 'age':21})

print(my_dict)
print(type(my_dict))
print(type(my_dict['name']))
print(type(my_dict['list']))
print(type(my_dict['dict']))
print(my_dict['dict']['age'])

my_dict['mobile'] = 9092174486

print(my_dict)
my_dict.pop('name')

my_dict.update({'name':"Vignesh", 'age' : 20})

for i in my_dict:
    print(i, my_dict[i])

dict1 = {x: x*x for x in range(1,5)}
print(dict1)