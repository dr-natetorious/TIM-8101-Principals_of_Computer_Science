class android.support.v7.widget.bv$a {
  int a;

  int b;

  int c;

  int d;

  int e;

  android.support.v7.widget.bv$a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #18                 // Field a:I
       9: return

  int a(int, int);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmple     7
       5: iconst_1
       6: ireturn
       7: iload_1
       8: iload_2
       9: if_icmpne     14
      12: iconst_2
      13: ireturn
      14: iconst_4
      15: ireturn

  void a();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #18                 // Field a:I
       5: return

  void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: getfield      #18                 // Field a:I
       6: ior
       7: putfield      #18                 // Field a:I
      10: return

  void a(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #24                 // Field b:I
       5: aload_0
       6: iload_2
       7: putfield      #26                 // Field c:I
      10: aload_0
      11: iload_3
      12: putfield      #28                 // Field d:I
      15: aload_0
      16: iload         4
      18: putfield      #30                 // Field e:I
      21: return

  boolean b();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:I
       4: bipush        7
       6: iand
       7: ifeq          34
      10: aload_0
      11: getfield      #18                 // Field a:I
      14: aload_0
      15: aload_0
      16: getfield      #28                 // Field d:I
      19: aload_0
      20: getfield      #24                 // Field b:I
      23: invokevirtual #33                 // Method a:(II)I
      26: iconst_0
      27: ishl
      28: iand
      29: ifne          34
      32: iconst_0
      33: ireturn
      34: aload_0
      35: getfield      #18                 // Field a:I
      38: bipush        112
      40: iand
      41: ifeq          68
      44: aload_0
      45: getfield      #18                 // Field a:I
      48: aload_0
      49: aload_0
      50: getfield      #28                 // Field d:I
      53: aload_0
      54: getfield      #26                 // Field c:I
      57: invokevirtual #33                 // Method a:(II)I
      60: iconst_4
      61: ishl
      62: iand
      63: ifne          68
      66: iconst_0
      67: ireturn
      68: aload_0
      69: getfield      #18                 // Field a:I
      72: sipush        1792
      75: iand
      76: ifeq          104
      79: aload_0
      80: getfield      #18                 // Field a:I
      83: aload_0
      84: aload_0
      85: getfield      #30                 // Field e:I
      88: aload_0
      89: getfield      #24                 // Field b:I
      92: invokevirtual #33                 // Method a:(II)I
      95: bipush        8
      97: ishl
      98: iand
      99: ifne          104
     102: iconst_0
     103: ireturn
     104: aload_0
     105: getfield      #18                 // Field a:I
     108: sipush        28672
     111: iand
     112: ifeq          140
     115: aload_0
     116: getfield      #18                 // Field a:I
     119: aload_0
     120: aload_0
     121: getfield      #30                 // Field e:I
     124: aload_0
     125: getfield      #26                 // Field c:I
     128: invokevirtual #33                 // Method a:(II)I
     131: bipush        12
     133: ishl
     134: iand
     135: ifne          140
     138: iconst_0
     139: ireturn
     140: iconst_1
     141: ireturn
}
