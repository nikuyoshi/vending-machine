# vending-machine

This project is cold drinks vending machine software in Japan.  

## Specifications

* Display goods (Limited 30 goods)
* Recognize a coin or a bill every time insert 
* Select goods someone want to drink
* Do a little math when pushed button
* Output changes
* Collect for bought good

ref: https://selfservicedesign.wordpress.com/tag/vending-machines/

### Input / Output

#### Input 

* Select Button (Limited 30 buttons)
* Coin insert slot
* Bill insert slot

#### Output

* Coin return
* Bill return
* Goods collect

## How to use

```
# java vending-machine.jar
Which one do you insert?
[1] Coin
[2] Bill

> 1

Which one do you insert?
[1] ¥1,000
[2] ¥2,000
[3] ¥5,000
[4] ¥1,0000

> 1

How many?

> 2

Jingle-jangle...
Total amounts: ¥2,000

Do you insert anything else?
[y/N]> y

Which one do you insert?
[1] Coin
[2] Bill

> 1

Which one do you insert?
[1] ¥1
[2] ¥5
[3] ¥10
[4] ¥50
[5] ¥100
[6] ¥500

> 5

How many?

> 2

Jingle-jangle...
Total amounts: ¥2,200 

Do you insert anything else?
[y/N]> N

Which goods do you choose?

[1] Coca-Cola
[2] Pepsi
[3] Iced coffee
[4] Iced tea
[5]
...

> 3

****************************
TOTAL ¥120
RECEIVED CASH ¥2,200
CHANGE ¥2080
    ¥1,000 * 2
    ¥50 * 1
    ¥10 * 3
****************************

```

## License

Apache License 2.0