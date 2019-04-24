public class android.support.v4.g.m<K, V> {
  static java.lang.Object[] b;

  static int c;

  static java.lang.Object[] d;

  static int e;

  int[] f;

  java.lang.Object[] g;

  int h;

  public android.support.v4.g.m();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #24                 // Field android/support/v4/g/c.a:[I
       8: putfield      #26                 // Field f:[I
      11: aload_0
      12: getstatic     #28                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      15: putfield      #30                 // Field g:[Ljava/lang/Object;
      18: aload_0
      19: iconst_0
      20: putfield      #32                 // Field h:I
      23: return

  public android.support.v4.g.m(int);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: iload_1
       5: ifne          25
       8: aload_0
       9: getstatic     #24                 // Field android/support/v4/g/c.a:[I
      12: putfield      #26                 // Field f:[I
      15: aload_0
      16: getstatic     #28                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      19: putfield      #30                 // Field g:[Ljava/lang/Object;
      22: goto          30
      25: aload_0
      26: iload_1
      27: invokespecial #36                 // Method e:(I)V
      30: aload_0
      31: iconst_0
      32: putfield      #32                 // Field h:I
      35: return

  public android.support.v4.g.m(android.support.v4.g.m<K, V>);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method "<init>":()V
       4: aload_1
       5: ifnull        13
       8: aload_0
       9: aload_1
      10: invokevirtual #40                 // Method a:(Landroid/support/v4/g/m;)V
      13: return

  int a();
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: istore_2
       5: iload_2
       6: ifne          11
       9: iconst_m1
      10: ireturn
      11: aload_0
      12: getfield      #26                 // Field f:[I
      15: iload_2
      16: iconst_0
      17: invokestatic  #65                 // Method a:([III)I
      20: istore_3
      21: iload_3
      22: ifge          27
      25: iload_3
      26: ireturn
      27: aload_0
      28: getfield      #30                 // Field g:[Ljava/lang/Object;
      31: iload_3
      32: iconst_1
      33: ishl
      34: aaload
      35: ifnonnull     40
      38: iload_3
      39: ireturn
      40: iload_3
      41: iconst_1
      42: iadd
      43: istore_1
      44: iload_1
      45: iload_2
      46: if_icmpge     78
      49: aload_0
      50: getfield      #26                 // Field f:[I
      53: iload_1
      54: iaload
      55: ifne          78
      58: aload_0
      59: getfield      #30                 // Field g:[Ljava/lang/Object;
      62: iload_1
      63: iconst_1
      64: ishl
      65: aaload
      66: ifnonnull     71
      69: iload_1
      70: ireturn
      71: iload_1
      72: iconst_1
      73: iadd
      74: istore_1
      75: goto          44
      78: iload_3
      79: iconst_1
      80: isub
      81: istore_2
      82: iload_2
      83: iflt          115
      86: aload_0
      87: getfield      #26                 // Field f:[I
      90: iload_2
      91: iaload
      92: ifne          115
      95: aload_0
      96: getfield      #30                 // Field g:[Ljava/lang/Object;
      99: iload_2
     100: iconst_1
     101: ishl
     102: aaload
     103: ifnonnull     108
     106: iload_2
     107: ireturn
     108: iload_2
     109: iconst_1
     110: isub
     111: istore_2
     112: goto          82
     115: iload_1
     116: iconst_m1
     117: ixor
     118: ireturn

  public int a(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     9
       4: aload_0
       5: invokevirtual #68                 // Method a:()I
       8: ireturn
       9: aload_0
      10: aload_1
      11: aload_1
      12: invokevirtual #71                 // Method java/lang/Object.hashCode:()I
      15: invokevirtual #74                 // Method a:(Ljava/lang/Object;I)I
      18: ireturn

  int a(java.lang.Object, int);
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: istore        4
       6: iload         4
       8: ifne          13
      11: iconst_m1
      12: ireturn
      13: aload_0
      14: getfield      #26                 // Field f:[I
      17: iload         4
      19: iload_2
      20: invokestatic  #65                 // Method a:([III)I
      23: istore        5
      25: iload         5
      27: ifge          33
      30: iload         5
      32: ireturn
      33: aload_1
      34: aload_0
      35: getfield      #30                 // Field g:[Ljava/lang/Object;
      38: iload         5
      40: iconst_1
      41: ishl
      42: aaload
      43: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      46: ifeq          52
      49: iload         5
      51: ireturn
      52: iload         5
      54: iconst_1
      55: iadd
      56: istore_3
      57: iload_3
      58: iload         4
      60: if_icmpge     97
      63: aload_0
      64: getfield      #26                 // Field f:[I
      67: iload_3
      68: iaload
      69: iload_2
      70: if_icmpne     97
      73: aload_1
      74: aload_0
      75: getfield      #30                 // Field g:[Ljava/lang/Object;
      78: iload_3
      79: iconst_1
      80: ishl
      81: aaload
      82: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      85: ifeq          90
      88: iload_3
      89: ireturn
      90: iload_3
      91: iconst_1
      92: iadd
      93: istore_3
      94: goto          57
      97: iload         5
      99: iconst_1
     100: isub
     101: istore        4
     103: iload         4
     105: iflt          147
     108: aload_0
     109: getfield      #26                 // Field f:[I
     112: iload         4
     114: iaload
     115: iload_2
     116: if_icmpne     147
     119: aload_1
     120: aload_0
     121: getfield      #30                 // Field g:[Ljava/lang/Object;
     124: iload         4
     126: iconst_1
     127: ishl
     128: aaload
     129: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
     132: ifeq          138
     135: iload         4
     137: ireturn
     138: iload         4
     140: iconst_1
     141: isub
     142: istore        4
     144: goto          103
     147: iload_3
     148: iconst_m1
     149: ixor
     150: ireturn

  public V a(int, V);
    Code:
       0: iload_1
       1: iconst_1
       2: ishl
       3: iconst_1
       4: iadd
       5: istore_1
       6: aload_0
       7: getfield      #30                 // Field g:[Ljava/lang/Object;
      10: iload_1
      11: aaload
      12: astore_3
      13: aload_0
      14: getfield      #30                 // Field g:[Ljava/lang/Object;
      17: iload_1
      18: aload_2
      19: aastore
      20: aload_3
      21: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: istore_2
       5: aload_0
       6: getfield      #26                 // Field f:[I
       9: arraylength
      10: iload_1
      11: if_icmpge     69
      14: aload_0
      15: getfield      #26                 // Field f:[I
      18: astore_3
      19: aload_0
      20: getfield      #30                 // Field g:[Ljava/lang/Object;
      23: astore        4
      25: aload_0
      26: iload_1
      27: invokespecial #36                 // Method e:(I)V
      30: aload_0
      31: getfield      #32                 // Field h:I
      34: ifle          62
      37: aload_3
      38: iconst_0
      39: aload_0
      40: getfield      #26                 // Field f:[I
      43: iconst_0
      44: iload_2
      45: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      48: aload         4
      50: iconst_0
      51: aload_0
      52: getfield      #30                 // Field g:[Ljava/lang/Object;
      55: iconst_0
      56: iload_2
      57: iconst_1
      58: ishl
      59: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      62: aload_3
      63: aload         4
      65: iload_2
      66: invokestatic  #88                 // Method a:([I[Ljava/lang/Object;I)V
      69: aload_0
      70: getfield      #32                 // Field h:I
      73: iload_2
      74: if_icmpeq     85
      77: new           #49                 // class java/util/ConcurrentModificationException
      80: dup
      81: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
      84: athrow
      85: return

  public void a(android.support.v4.g.m<? extends K, ? extends V>);
    Code:
       0: aload_1
       1: getfield      #32                 // Field h:I
       4: istore_3
       5: aload_0
       6: aload_0
       7: getfield      #32                 // Field h:I
      10: iload_3
      11: iadd
      12: invokevirtual #90                 // Method a:(I)V
      15: aload_0
      16: getfield      #32                 // Field h:I
      19: istore        4
      21: iconst_0
      22: istore_2
      23: iload         4
      25: ifne          68
      28: iload_3
      29: ifle          95
      32: aload_1
      33: getfield      #26                 // Field f:[I
      36: iconst_0
      37: aload_0
      38: getfield      #26                 // Field f:[I
      41: iconst_0
      42: iload_3
      43: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      46: aload_1
      47: getfield      #30                 // Field g:[Ljava/lang/Object;
      50: iconst_0
      51: aload_0
      52: getfield      #30                 // Field g:[Ljava/lang/Object;
      55: iconst_0
      56: iload_3
      57: iconst_1
      58: ishl
      59: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      62: aload_0
      63: iload_3
      64: putfield      #32                 // Field h:I
      67: return
      68: iload_2
      69: iload_3
      70: if_icmpge     95
      73: aload_0
      74: aload_1
      75: iload_2
      76: invokevirtual #93                 // Method b:(I)Ljava/lang/Object;
      79: aload_1
      80: iload_2
      81: invokevirtual #95                 // Method c:(I)Ljava/lang/Object;
      84: invokevirtual #99                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      87: pop
      88: iload_2
      89: iconst_1
      90: iadd
      91: istore_2
      92: goto          68
      95: return

  int b(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: iconst_2
       5: imul
       6: istore_3
       7: aload_0
       8: getfield      #30                 // Field g:[Ljava/lang/Object;
      11: astore        4
      13: aload_1
      14: ifnonnull     42
      17: iconst_1
      18: istore_2
      19: iload_2
      20: iload_3
      21: if_icmpge     71
      24: aload         4
      26: iload_2
      27: aaload
      28: ifnonnull     35
      31: iload_2
      32: iconst_1
      33: ishr
      34: ireturn
      35: iload_2
      36: iconst_2
      37: iadd
      38: istore_2
      39: goto          19
      42: iconst_1
      43: istore_2
      44: iload_2
      45: iload_3
      46: if_icmpge     71
      49: aload_1
      50: aload         4
      52: iload_2
      53: aaload
      54: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      57: ifeq          64
      60: iload_2
      61: iconst_1
      62: ishr
      63: ireturn
      64: iload_2
      65: iconst_2
      66: iadd
      67: istore_2
      68: goto          44
      71: iconst_m1
      72: ireturn

  public K b(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field g:[Ljava/lang/Object;
       4: iload_1
       5: iconst_1
       6: ishl
       7: aaload
       8: areturn

  public V c(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field g:[Ljava/lang/Object;
       4: iload_1
       5: iconst_1
       6: ishl
       7: iconst_1
       8: iadd
       9: aaload
      10: areturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: ifle          47
       7: aload_0
       8: getfield      #26                 // Field f:[I
      11: astore_2
      12: aload_0
      13: getfield      #30                 // Field g:[Ljava/lang/Object;
      16: astore_3
      17: aload_0
      18: getfield      #32                 // Field h:I
      21: istore_1
      22: aload_0
      23: getstatic     #24                 // Field android/support/v4/g/c.a:[I
      26: putfield      #26                 // Field f:[I
      29: aload_0
      30: getstatic     #28                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      33: putfield      #30                 // Field g:[Ljava/lang/Object;
      36: aload_0
      37: iconst_0
      38: putfield      #32                 // Field h:I
      41: aload_2
      42: aload_3
      43: iload_1
      44: invokestatic  #88                 // Method a:([I[Ljava/lang/Object;I)V
      47: aload_0
      48: getfield      #32                 // Field h:I
      51: ifle          62
      54: new           #49                 // class java/util/ConcurrentModificationException
      57: dup
      58: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
      61: athrow
      62: return

  public boolean containsKey(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #106                // Method a:(Ljava/lang/Object;)I
       5: iflt          10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public boolean containsValue(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #109                // Method b:(Ljava/lang/Object;)I
       5: iflt          10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public V d(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field g:[Ljava/lang/Object;
       4: astore        7
       6: iload_1
       7: iconst_1
       8: ishl
       9: istore        5
      11: aload         7
      13: iload         5
      15: iconst_1
      16: iadd
      17: aaload
      18: astore        7
      20: aload_0
      21: getfield      #32                 // Field h:I
      24: istore        4
      26: iconst_0
      27: istore_2
      28: iload         4
      30: iconst_1
      31: if_icmpgt     66
      34: aload_0
      35: getfield      #26                 // Field f:[I
      38: aload_0
      39: getfield      #30                 // Field g:[Ljava/lang/Object;
      42: iload         4
      44: invokestatic  #88                 // Method a:([I[Ljava/lang/Object;I)V
      47: aload_0
      48: getstatic     #24                 // Field android/support/v4/g/c.a:[I
      51: putfield      #26                 // Field f:[I
      54: aload_0
      55: getstatic     #28                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      58: putfield      #30                 // Field g:[Ljava/lang/Object;
      61: iload_2
      62: istore_1
      63: goto          315
      66: iload         4
      68: iconst_1
      69: isub
      70: istore_3
      71: aload_0
      72: getfield      #26                 // Field f:[I
      75: arraylength
      76: istore        6
      78: bipush        8
      80: istore_2
      81: iload         6
      83: bipush        8
      85: if_icmple     232
      88: aload_0
      89: getfield      #32                 // Field h:I
      92: aload_0
      93: getfield      #26                 // Field f:[I
      96: arraylength
      97: iconst_3
      98: idiv
      99: if_icmpge     232
     102: iload         4
     104: bipush        8
     106: if_icmple     117
     109: iload         4
     111: iload         4
     113: iconst_1
     114: ishr
     115: iadd
     116: istore_2
     117: aload_0
     118: getfield      #26                 // Field f:[I
     121: astore        8
     123: aload_0
     124: getfield      #30                 // Field g:[Ljava/lang/Object;
     127: astore        9
     129: aload_0
     130: iload_2
     131: invokespecial #36                 // Method e:(I)V
     134: iload         4
     136: aload_0
     137: getfield      #32                 // Field h:I
     140: if_icmpeq     151
     143: new           #49                 // class java/util/ConcurrentModificationException
     146: dup
     147: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
     150: athrow
     151: iload_1
     152: ifle          180
     155: aload         8
     157: iconst_0
     158: aload_0
     159: getfield      #26                 // Field f:[I
     162: iconst_0
     163: iload_1
     164: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     167: aload         9
     169: iconst_0
     170: aload_0
     171: getfield      #30                 // Field g:[Ljava/lang/Object;
     174: iconst_0
     175: iload         5
     177: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     180: iload_1
     181: iload_3
     182: if_icmpge     313
     185: iload_1
     186: iconst_1
     187: iadd
     188: istore_2
     189: aload_0
     190: getfield      #26                 // Field f:[I
     193: astore        10
     195: iload_3
     196: iload_1
     197: isub
     198: istore        6
     200: aload         8
     202: iload_2
     203: aload         10
     205: iload_1
     206: iload         6
     208: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     211: aload         9
     213: iload_2
     214: iconst_1
     215: ishl
     216: aload_0
     217: getfield      #30                 // Field g:[Ljava/lang/Object;
     220: iload         5
     222: iload         6
     224: iconst_1
     225: ishl
     226: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     229: goto          313
     232: iload_1
     233: iload_3
     234: if_icmpge     289
     237: aload_0
     238: getfield      #26                 // Field f:[I
     241: astore        8
     243: iload_1
     244: iconst_1
     245: iadd
     246: istore_2
     247: aload_0
     248: getfield      #26                 // Field f:[I
     251: astore        9
     253: iload_3
     254: iload_1
     255: isub
     256: istore        6
     258: aload         8
     260: iload_2
     261: aload         9
     263: iload_1
     264: iload         6
     266: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     269: aload_0
     270: getfield      #30                 // Field g:[Ljava/lang/Object;
     273: iload_2
     274: iconst_1
     275: ishl
     276: aload_0
     277: getfield      #30                 // Field g:[Ljava/lang/Object;
     280: iload         5
     282: iload         6
     284: iconst_1
     285: ishl
     286: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     289: aload_0
     290: getfield      #30                 // Field g:[Ljava/lang/Object;
     293: astore        8
     295: iload_3
     296: iconst_1
     297: ishl
     298: istore_1
     299: aload         8
     301: iload_1
     302: aconst_null
     303: aastore
     304: aload_0
     305: getfield      #30                 // Field g:[Ljava/lang/Object;
     308: iload_1
     309: iconst_1
     310: iadd
     311: aconst_null
     312: aastore
     313: iload_3
     314: istore_1
     315: iload         4
     317: aload_0
     318: getfield      #32                 // Field h:I
     321: if_icmpeq     332
     324: new           #49                 // class java/util/ConcurrentModificationException
     327: dup
     328: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
     331: athrow
     332: aload_0
     333: iload_1
     334: putfield      #32                 // Field h:I
     337: aload         7
     339: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class android/support/v4/g/m
      11: ifeq          108
      14: aload_1
      15: checkcast     #2                  // class android/support/v4/g/m
      18: astore_1
      19: aload_0
      20: invokevirtual #116                // Method size:()I
      23: aload_1
      24: invokevirtual #116                // Method size:()I
      27: if_icmpeq     32
      30: iconst_0
      31: ireturn
      32: iconst_0
      33: istore_2
      34: iload_2
      35: aload_0
      36: getfield      #32                 // Field h:I
      39: if_icmpge     106
      42: aload_0
      43: iload_2
      44: invokevirtual #93                 // Method b:(I)Ljava/lang/Object;
      47: astore        4
      49: aload_0
      50: iload_2
      51: invokevirtual #95                 // Method c:(I)Ljava/lang/Object;
      54: astore        5
      56: aload_1
      57: aload         4
      59: invokevirtual #120                // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
      62: astore        6
      64: aload         5
      66: ifnonnull     85
      69: aload         6
      71: ifnonnull     223
      74: aload_1
      75: aload         4
      77: invokevirtual #122                // Method containsKey:(Ljava/lang/Object;)Z
      80: ifne          99
      83: iconst_0
      84: ireturn
      85: aload         5
      87: aload         6
      89: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      92: istore_3
      93: iload_3
      94: ifne          99
      97: iconst_0
      98: ireturn
      99: iload_2
     100: iconst_1
     101: iadd
     102: istore_2
     103: goto          34
     106: iconst_1
     107: ireturn
     108: aload_1
     109: instanceof    #124                // class java/util/Map
     112: ifeq          215
     115: aload_1
     116: checkcast     #124                // class java/util/Map
     119: astore_1
     120: aload_0
     121: invokevirtual #116                // Method size:()I
     124: aload_1
     125: invokeinterface #125,  1          // InterfaceMethod java/util/Map.size:()I
     130: if_icmpeq     135
     133: iconst_0
     134: ireturn
     135: iconst_0
     136: istore_2
     137: iload_2
     138: aload_0
     139: getfield      #32                 // Field h:I
     142: if_icmpge     213
     145: aload_0
     146: iload_2
     147: invokevirtual #93                 // Method b:(I)Ljava/lang/Object;
     150: astore        4
     152: aload_0
     153: iload_2
     154: invokevirtual #95                 // Method c:(I)Ljava/lang/Object;
     157: astore        5
     159: aload_1
     160: aload         4
     162: invokeinterface #126,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     167: astore        6
     169: aload         5
     171: ifnonnull     192
     174: aload         6
     176: ifnonnull     225
     179: aload_1
     180: aload         4
     182: invokeinterface #127,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
     187: ifne          206
     190: iconst_0
     191: ireturn
     192: aload         5
     194: aload         6
     196: invokevirtual #78                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
     199: istore_3
     200: iload_3
     201: ifne          206
     204: iconst_0
     205: ireturn
     206: iload_2
     207: iconst_1
     208: iadd
     209: istore_2
     210: goto          137
     213: iconst_1
     214: ireturn
     215: iconst_0
     216: ireturn
     217: astore_1
     218: iconst_0
     219: ireturn
     220: astore_1
     221: iconst_0
     222: ireturn
     223: iconst_0
     224: ireturn
     225: iconst_0
     226: ireturn
    Exception table:
       from    to  target type
          34    64   217   Class java/lang/NullPointerException
          34    64   217   Class java/lang/ClassCastException
          74    83   217   Class java/lang/NullPointerException
          74    83   217   Class java/lang/ClassCastException
          85    93   217   Class java/lang/NullPointerException
          85    93   217   Class java/lang/ClassCastException
         137   169   220   Class java/lang/NullPointerException
         137   169   220   Class java/lang/ClassCastException
         179   190   220   Class java/lang/NullPointerException
         179   190   220   Class java/lang/ClassCastException
         192   200   220   Class java/lang/NullPointerException
         192   200   220   Class java/lang/ClassCastException

  public V get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #106                // Method a:(Ljava/lang/Object;)I
       5: istore_2
       6: iload_2
       7: iflt          21
      10: aload_0
      11: getfield      #30                 // Field g:[Ljava/lang/Object;
      14: iload_2
      15: iconst_1
      16: ishl
      17: iconst_1
      18: iadd
      19: aaload
      20: areturn
      21: aconst_null
      22: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #26                 // Field f:[I
       4: astore        7
       6: aload_0
       7: getfield      #30                 // Field g:[Ljava/lang/Object;
      10: astore        8
      12: aload_0
      13: getfield      #32                 // Field h:I
      16: istore        5
      18: iconst_0
      19: istore_2
      20: iconst_1
      21: istore_1
      22: iconst_0
      23: istore_3
      24: iload_2
      25: iload         5
      27: if_icmpge     79
      30: aload         8
      32: iload_1
      33: aaload
      34: astore        9
      36: aload         7
      38: iload_2
      39: iaload
      40: istore        6
      42: aload         9
      44: ifnonnull     53
      47: iconst_0
      48: istore        4
      50: goto          60
      53: aload         9
      55: invokevirtual #71                 // Method java/lang/Object.hashCode:()I
      58: istore        4
      60: iload_3
      61: iload         4
      63: iload         6
      65: ixor
      66: iadd
      67: istore_3
      68: iload_2
      69: iconst_1
      70: iadd
      71: istore_2
      72: iload_1
      73: iconst_2
      74: iadd
      75: istore_1
      76: goto          24
      79: iload_3
      80: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: ifgt          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public V put(K, V);
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: istore        5
       6: aload_1
       7: ifnonnull     21
      10: aload_0
      11: invokevirtual #68                 // Method a:()I
      14: istore_3
      15: iconst_0
      16: istore        4
      18: goto          35
      21: aload_1
      22: invokevirtual #71                 // Method java/lang/Object.hashCode:()I
      25: istore        4
      27: aload_0
      28: aload_1
      29: iload         4
      31: invokevirtual #74                 // Method a:(Ljava/lang/Object;I)I
      34: istore_3
      35: iload_3
      36: iflt          61
      39: iload_3
      40: iconst_1
      41: ishl
      42: iconst_1
      43: iadd
      44: istore_3
      45: aload_0
      46: getfield      #30                 // Field g:[Ljava/lang/Object;
      49: iload_3
      50: aaload
      51: astore_1
      52: aload_0
      53: getfield      #30                 // Field g:[Ljava/lang/Object;
      56: iload_3
      57: aload_2
      58: aastore
      59: aload_1
      60: areturn
      61: iload_3
      62: iconst_m1
      63: ixor
      64: istore        6
      66: iload         5
      68: aload_0
      69: getfield      #26                 // Field f:[I
      72: arraylength
      73: if_icmplt     184
      76: iconst_4
      77: istore_3
      78: iload         5
      80: bipush        8
      82: if_icmplt     96
      85: iload         5
      87: iconst_1
      88: ishr
      89: iload         5
      91: iadd
      92: istore_3
      93: goto          105
      96: iload         5
      98: iconst_4
      99: if_icmplt     105
     102: bipush        8
     104: istore_3
     105: aload_0
     106: getfield      #26                 // Field f:[I
     109: astore        7
     111: aload_0
     112: getfield      #30                 // Field g:[Ljava/lang/Object;
     115: astore        8
     117: aload_0
     118: iload_3
     119: invokespecial #36                 // Method e:(I)V
     122: iload         5
     124: aload_0
     125: getfield      #32                 // Field h:I
     128: if_icmpeq     139
     131: new           #49                 // class java/util/ConcurrentModificationException
     134: dup
     135: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
     138: athrow
     139: aload_0
     140: getfield      #26                 // Field f:[I
     143: arraylength
     144: ifle          175
     147: aload         7
     149: iconst_0
     150: aload_0
     151: getfield      #26                 // Field f:[I
     154: iconst_0
     155: aload         7
     157: arraylength
     158: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     161: aload         8
     163: iconst_0
     164: aload_0
     165: getfield      #30                 // Field g:[Ljava/lang/Object;
     168: iconst_0
     169: aload         8
     171: arraylength
     172: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     175: aload         7
     177: aload         8
     179: iload         5
     181: invokestatic  #88                 // Method a:([I[Ljava/lang/Object;I)V
     184: iload         6
     186: iload         5
     188: if_icmpge     250
     191: aload_0
     192: getfield      #26                 // Field f:[I
     195: astore        7
     197: aload_0
     198: getfield      #26                 // Field f:[I
     201: astore        8
     203: iload         6
     205: iconst_1
     206: iadd
     207: istore_3
     208: aload         7
     210: iload         6
     212: aload         8
     214: iload_3
     215: iload         5
     217: iload         6
     219: isub
     220: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     223: aload_0
     224: getfield      #30                 // Field g:[Ljava/lang/Object;
     227: iload         6
     229: iconst_1
     230: ishl
     231: aload_0
     232: getfield      #30                 // Field g:[Ljava/lang/Object;
     235: iload_3
     236: iconst_1
     237: ishl
     238: aload_0
     239: getfield      #32                 // Field h:I
     242: iload         6
     244: isub
     245: iconst_1
     246: ishl
     247: invokestatic  #86                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     250: iload         5
     252: aload_0
     253: getfield      #32                 // Field h:I
     256: if_icmpne     318
     259: iload         6
     261: aload_0
     262: getfield      #26                 // Field f:[I
     265: arraylength
     266: if_icmplt     272
     269: goto          318
     272: aload_0
     273: getfield      #26                 // Field f:[I
     276: iload         6
     278: iload         4
     280: iastore
     281: aload_0
     282: getfield      #30                 // Field g:[Ljava/lang/Object;
     285: astore        7
     287: iload         6
     289: iconst_1
     290: ishl
     291: istore_3
     292: aload         7
     294: iload_3
     295: aload_1
     296: aastore
     297: aload_0
     298: getfield      #30                 // Field g:[Ljava/lang/Object;
     301: iload_3
     302: iconst_1
     303: iadd
     304: aload_2
     305: aastore
     306: aload_0
     307: aload_0
     308: getfield      #32                 // Field h:I
     311: iconst_1
     312: iadd
     313: putfield      #32                 // Field h:I
     316: aconst_null
     317: areturn
     318: new           #49                 // class java/util/ConcurrentModificationException
     321: dup
     322: invokespecial #50                 // Method java/util/ConcurrentModificationException."<init>":()V
     325: athrow

  public V remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #106                // Method a:(Ljava/lang/Object;)I
       5: istore_2
       6: iload_2
       7: iflt          16
      10: aload_0
      11: iload_2
      12: invokevirtual #134                // Method d:(I)Ljava/lang/Object;
      15: areturn
      16: aconst_null
      17: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #32                 // Field h:I
       4: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #138                // Method isEmpty:()Z
       4: ifeq          10
       7: ldc           #140                // String {}
       9: areturn
      10: new           #142                // class java/lang/StringBuilder
      13: dup
      14: aload_0
      15: getfield      #32                 // Field h:I
      18: bipush        28
      20: imul
      21: invokespecial #144                // Method java/lang/StringBuilder."<init>":(I)V
      24: astore_2
      25: aload_2
      26: bipush        123
      28: invokevirtual #148                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      31: pop
      32: iconst_0
      33: istore_1
      34: iload_1
      35: aload_0
      36: getfield      #32                 // Field h:I
      39: if_icmpge     121
      42: iload_1
      43: ifle          53
      46: aload_2
      47: ldc           #150                // String ,
      49: invokevirtual #153                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_0
      54: iload_1
      55: invokevirtual #93                 // Method b:(I)Ljava/lang/Object;
      58: astore_3
      59: aload_3
      60: aload_0
      61: if_acmpeq     73
      64: aload_2
      65: aload_3
      66: invokevirtual #156                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      69: pop
      70: goto          80
      73: aload_2
      74: ldc           #158                // String (this Map)
      76: invokevirtual #153                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: aload_2
      81: bipush        61
      83: invokevirtual #148                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      86: pop
      87: aload_0
      88: iload_1
      89: invokevirtual #95                 // Method c:(I)Ljava/lang/Object;
      92: astore_3
      93: aload_3
      94: aload_0
      95: if_acmpeq     107
      98: aload_2
      99: aload_3
     100: invokevirtual #156                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     103: pop
     104: goto          114
     107: aload_2
     108: ldc           #158                // String (this Map)
     110: invokevirtual #153                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     113: pop
     114: iload_1
     115: iconst_1
     116: iadd
     117: istore_1
     118: goto          34
     121: aload_2
     122: bipush        125
     124: invokevirtual #148                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     127: pop
     128: aload_2
     129: invokevirtual #160                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     132: areturn
}
