class com.google.common.base.Stopwatch$1 {
  static final int[] $SwitchMap$java$util$concurrent$TimeUnit;

  static {};
    Code:
       0: invokestatic  #18                 // Method java/util/concurrent/TimeUnit.values:()[Ljava/util/concurrent/TimeUnit;
       3: arraylength
       4: newarray       int
       6: putstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
       9: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      12: getstatic     #24                 // Field java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
      15: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      18: iconst_1
      19: iastore
      20: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      23: getstatic     #31                 // Field java/util/concurrent/TimeUnit.MICROSECONDS:Ljava/util/concurrent/TimeUnit;
      26: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      29: iconst_2
      30: iastore
      31: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      34: getstatic     #34                 // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
      37: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      40: iconst_3
      41: iastore
      42: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      45: getstatic     #37                 // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
      48: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      51: iconst_4
      52: iastore
      53: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      56: getstatic     #40                 // Field java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
      59: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      62: iconst_5
      63: iastore
      64: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      67: getstatic     #43                 // Field java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
      70: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      73: bipush        6
      75: iastore
      76: getstatic     #20                 // Field $SwitchMap$java$util$concurrent$TimeUnit:[I
      79: getstatic     #46                 // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      82: invokevirtual #28                 // Method java/util/concurrent/TimeUnit.ordinal:()I
      85: bipush        7
      87: iastore
      88: return
      89: astore_0
      90: goto          20
      93: astore_0
      94: goto          31
      97: astore_0
      98: goto          42
     101: astore_0
     102: goto          53
     105: astore_0
     106: goto          64
     109: astore_0
     110: goto          76
     113: astore_0
     114: return
    Exception table:
       from    to  target type
           9    20    89   Class java/lang/NoSuchFieldError
          20    31    93   Class java/lang/NoSuchFieldError
          31    42    97   Class java/lang/NoSuchFieldError
          42    53   101   Class java/lang/NoSuchFieldError
          53    64   105   Class java/lang/NoSuchFieldError
          64    76   109   Class java/lang/NoSuchFieldError
          76    88   113   Class java/lang/NoSuchFieldError
}
