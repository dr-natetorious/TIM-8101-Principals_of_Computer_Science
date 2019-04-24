public final class com.c.a.b {
  public static final com.c.a.b a;

  static {};
    Code:
       0: new           #2                  // class com/c/a/b
       3: dup
       4: invokespecial #11                 // Method "<init>":()V
       7: putstatic     #13                 // Field a:Lcom/c/a/b;
      10: return

  public final int a(int);
    Code:
       0: iload_1
       1: sipush        240
       4: iand
       5: ireturn

  public final int a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #22                 // Method a:(I)I
       5: istore_1
       6: iload_1
       7: bipush        16
       9: if_icmpeq     30
      12: iload_1
      13: bipush        32
      15: if_icmpeq     28
      18: iload_1
      19: bipush        48
      21: if_icmpeq     26
      24: iload_2
      25: ireturn
      26: iconst_1
      27: ireturn
      28: iconst_5
      29: ireturn
      30: iconst_3
      31: ireturn

  public final int b(int);
    Code:
       0: iload_1
       1: sipush        -241
       4: iand
       5: ireturn

  public final int b(int, int);
    Code:
       0: iload_2
       1: istore_3
       2: aload_0
       3: iload_1
       4: invokevirtual #22                 // Method a:(I)I
       7: tableswitch   { // 1 to 4
                     1: 44
                     2: 41
                     3: 38
                     4: 47
               default: 36
          }
      36: iload_2
      37: ireturn
      38: bipush        16
      40: ireturn
      41: bipush        80
      43: ireturn
      44: bipush        48
      46: istore_3
      47: iload_3
      48: ireturn

  public final boolean c(int);
    Code:
       0: iload_1
       1: bipush        68
       3: if_icmpeq     26
       6: iload_1
       7: ifeq          26
      10: iload_1
      11: bipush        64
      13: if_icmpeq     26
      16: iload_1
      17: iconst_4
      18: if_icmpne     24
      21: goto          26
      24: iconst_0
      25: ireturn
      26: iconst_1
      27: ireturn
}
