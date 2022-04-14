```
DataTypes object internals:
OFF  SZ               TYPE DESCRIPTION               VALUE
0   8                    (object header: mark)     N/A
8   8                    (object header: class)    N/A
16   8               long DataTypes.longValue       N/A
24   8             double DataTypes.doubleValue     N/A
32   4                int DataTypes.intValue        N/A
36   4              float DataTypes.floatValue      N/A
40   2               char DataTypes.charValue       N/A
42   2              short DataTypes.shortValue      N/A
44   1            boolean DataTypes.booleanValue    N/A
45   1               byte DataTypes.byteValue       N/A
46   2                    (alignment/padding gap)   
48   8   java.lang.String DataTypes.stringValue     N/A
Instance size: 56 bytes
Space losses: 2 bytes internal + 0 bytes external = 2 bytes total
```