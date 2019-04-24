class android.support.v7.widget.f$b {
  int a;

  int b;

  java.lang.Object c;

  int d;

  android.support.v7.widget.f$b(int, int, int, java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #19                 // Field a:I
       9: aload_0
      10: iload_2
      11: putfield      #21                 // Field b:I
      14: aload_0
      15: iload_3
      16: putfield      #23                 // Field d:I
      19: aload_0
      20: aload         4
      22: putfield      #25                 // Field c:Ljava/lang/Object;
      25: return

  java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:I
       4: istore_1
       5: iload_1
       6: iconst_4
       7: if_icmpeq     52
      10: iload_1
      11: bipush        8
      13: if_icmpeq     49
      16: iload_1
      17: tableswitch   { // 1 to 2
                     1: 46
                     2: 43
               default: 40
          }
      40: ldc           #29                 // String ??
      42: areturn
      43: ldc           #31                 // String rm
      45: areturn
      46: ldc           #33                 // String add
      48: areturn
      49: ldc           #35                 // String mv
      51: areturn
      52: ldc           #37                 // String up
      54: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        151
      11: aload_0
      12: invokevirtual #43                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #43                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     24
      22: iconst_0
      23: ireturn
      24: aload_1
      25: checkcast     #2                  // class android/support/v7/widget/f$b
      28: astore_1
      29: aload_0
      30: getfield      #19                 // Field a:I
      33: aload_1
      34: getfield      #19                 // Field a:I
      37: if_icmpeq     42
      40: iconst_0
      41: ireturn
      42: aload_0
      43: getfield      #19                 // Field a:I
      46: bipush        8
      48: if_icmpne     91
      51: aload_0
      52: getfield      #23                 // Field d:I
      55: aload_0
      56: getfield      #21                 // Field b:I
      59: isub
      60: invokestatic  #49                 // Method java/lang/Math.abs:(I)I
      63: iconst_1
      64: if_icmpne     91
      67: aload_0
      68: getfield      #23                 // Field d:I
      71: aload_1
      72: getfield      #21                 // Field b:I
      75: if_icmpne     91
      78: aload_0
      79: getfield      #21                 // Field b:I
      82: aload_1
      83: getfield      #23                 // Field d:I
      86: if_icmpne     91
      89: iconst_1
      90: ireturn
      91: aload_0
      92: getfield      #23                 // Field d:I
      95: aload_1
      96: getfield      #23                 // Field d:I
      99: if_icmpeq     104
     102: iconst_0
     103: ireturn
     104: aload_0
     105: getfield      #21                 // Field b:I
     108: aload_1
     109: getfield      #21                 // Field b:I
     112: if_icmpeq     117
     115: iconst_0
     116: ireturn
     117: aload_0
     118: getfield      #25                 // Field c:Ljava/lang/Object;
     121: ifnull        140
     124: aload_0
     125: getfield      #25                 // Field c:Ljava/lang/Object;
     128: aload_1
     129: getfield      #25                 // Field c:Ljava/lang/Object;
     132: invokevirtual #51                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
     135: ifne          149
     138: iconst_0
     139: ireturn
     140: aload_1
     141: getfield      #25                 // Field c:Ljava/lang/Object;
     144: ifnull        149
     147: iconst_0
     148: ireturn
     149: iconst_1
     150: ireturn
     151: iconst_0
     152: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:I
       4: bipush        31
       6: imul
       7: aload_0
       8: getfield      #21                 // Field b:I
      11: iadd
      12: bipush        31
      14: imul
      15: aload_0
      16: getfield      #23                 // Field d:I
      19: iadd
      20: ireturn

  public java.lang.String toString();
    Code:
       0: new           #56                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #57                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: invokestatic  #63                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      13: invokestatic  #69                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      16: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: pop
      20: aload_1
      21: ldc           #75                 // String [
      23: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: aload_0
      29: invokevirtual #77                 // Method a:()Ljava/lang/String;
      32: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: pop
      36: aload_1
      37: ldc           #79                 // String ,s:
      39: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: aload_0
      45: getfield      #21                 // Field b:I
      48: invokevirtual #82                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      51: pop
      52: aload_1
      53: ldc           #84                 // String c:
      55: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      58: pop
      59: aload_1
      60: aload_0
      61: getfield      #23                 // Field d:I
      64: invokevirtual #82                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      67: pop
      68: aload_1
      69: ldc           #86                 // String ,p:
      71: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: aload_1
      76: aload_0
      77: getfield      #25                 // Field c:Ljava/lang/Object;
      80: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      83: pop
      84: aload_1
      85: ldc           #91                 // String ]
      87: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      90: pop
      91: aload_1
      92: invokevirtual #93                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      95: areturn
}
