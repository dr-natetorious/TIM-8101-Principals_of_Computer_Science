public class android.support.v4.g.f<E> implements java.lang.Cloneable {
  static {};
    Code:
       0: new           #5                  // class java/lang/Object
       3: dup
       4: invokespecial #22                 // Method java/lang/Object."<init>":()V
       7: putstatic     #24                 // Field a:Ljava/lang/Object;
      10: return

  public android.support.v4.g.f();
    Code:
       0: aload_0
       1: bipush        10
       3: invokespecial #28                 // Method "<init>":(I)V
       6: return

  public android.support.v4.g.f(int);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #30                 // Field b:Z
       9: iload_1
      10: ifne          32
      13: aload_0
      14: getstatic     #34                 // Field android/support/v4/g/c.b:[J
      17: putfield      #36                 // Field c:[J
      20: getstatic     #38                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      23: astore_2
      24: aload_0
      25: aload_2
      26: putfield      #40                 // Field d:[Ljava/lang/Object;
      29: goto          52
      32: iload_1
      33: invokestatic  #43                 // Method android/support/v4/g/c.b:(I)I
      36: istore_1
      37: aload_0
      38: iload_1
      39: newarray       long
      41: putfield      #36                 // Field c:[J
      44: iload_1
      45: anewarray     #5                  // class java/lang/Object
      48: astore_2
      49: goto          24
      52: aload_0
      53: iconst_0
      54: putfield      #45                 // Field e:I
      57: return

  public android.support.v4.g.f<E> a();
    Code:
       0: aload_0
       1: invokespecial #52                 // Method java/lang/Object.clone:()Ljava/lang/Object;
       4: checkcast     #2                  // class android/support/v4/g/f
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field c:[J
      13: invokevirtual #54                 // Method "[J".clone:()Ljava/lang/Object;
      16: checkcast     #53                 // class "[J"
      19: putfield      #36                 // Field c:[J
      22: aload_1
      23: aload_0
      24: getfield      #40                 // Field d:[Ljava/lang/Object;
      27: invokevirtual #56                 // Method "[Ljava/lang/Object;".clone:()Ljava/lang/Object;
      30: checkcast     #55                 // class "[Ljava/lang/Object;"
      33: putfield      #40                 // Field d:[Ljava/lang/Object;
      36: aload_1
      37: areturn
      38: aconst_null
      39: areturn
      40: astore_1
      41: goto          38
      44: astore_2
      45: aload_1
      46: areturn
    Exception table:
       from    to  target type
           0     8    40   Class java/lang/CloneNotSupportedException
           8    36    44   Class java/lang/CloneNotSupportedException

  public E a(long);
    Code:
       0: aload_0
       1: lload_1
       2: aconst_null
       3: invokevirtual #62                 // Method a:(JLjava/lang/Object;)Ljava/lang/Object;
       6: areturn

  public E a(long, E);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[J
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: lload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([JIJ)I
      12: istore        4
      14: iload         4
      16: iflt          42
      19: aload_0
      20: getfield      #40                 // Field d:[Ljava/lang/Object;
      23: iload         4
      25: aaload
      26: getstatic     #24                 // Field a:Ljava/lang/Object;
      29: if_acmpne     34
      32: aload_3
      33: areturn
      34: aload_0
      35: getfield      #40                 // Field d:[Ljava/lang/Object;
      38: iload         4
      40: aaload
      41: areturn
      42: aload_3
      43: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #40                 // Field d:[Ljava/lang/Object;
       4: iload_1
       5: aaload
       6: getstatic     #24                 // Field a:Ljava/lang/Object;
       9: if_acmpeq     26
      12: aload_0
      13: getfield      #40                 // Field d:[Ljava/lang/Object;
      16: iload_1
      17: getstatic     #24                 // Field a:Ljava/lang/Object;
      20: aastore
      21: aload_0
      22: iconst_1
      23: putfield      #30                 // Field b:Z
      26: return

  public int b();
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #45                 // Field e:I
      15: ireturn

  public long b(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #36                 // Field c:[J
      15: iload_1
      16: laload
      17: lreturn

  public void b(long);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[J
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: lload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([JIJ)I
      12: istore_3
      13: iload_3
      14: iflt          43
      17: aload_0
      18: getfield      #40                 // Field d:[Ljava/lang/Object;
      21: iload_3
      22: aaload
      23: getstatic     #24                 // Field a:Ljava/lang/Object;
      26: if_acmpeq     43
      29: aload_0
      30: getfield      #40                 // Field d:[Ljava/lang/Object;
      33: iload_3
      34: getstatic     #24                 // Field a:Ljava/lang/Object;
      37: aastore
      38: aload_0
      39: iconst_1
      40: putfield      #30                 // Field b:Z
      43: return

  public void b(long, E);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[J
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: lload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([JIJ)I
      12: istore        4
      14: iload         4
      16: iflt          28
      19: aload_0
      20: getfield      #40                 // Field d:[Ljava/lang/Object;
      23: iload         4
      25: aload_3
      26: aastore
      27: return
      28: iload         4
      30: iconst_m1
      31: ixor
      32: istore        5
      34: iload         5
      36: aload_0
      37: getfield      #45                 // Field e:I
      40: if_icmpge     73
      43: aload_0
      44: getfield      #40                 // Field d:[Ljava/lang/Object;
      47: iload         5
      49: aaload
      50: getstatic     #24                 // Field a:Ljava/lang/Object;
      53: if_acmpne     73
      56: aload_0
      57: getfield      #36                 // Field c:[J
      60: iload         5
      62: lload_1
      63: lastore
      64: aload_0
      65: getfield      #40                 // Field d:[Ljava/lang/Object;
      68: iload         5
      70: aload_3
      71: aastore
      72: return
      73: iload         5
      75: istore        4
      77: aload_0
      78: getfield      #30                 // Field b:Z
      81: ifeq          120
      84: iload         5
      86: istore        4
      88: aload_0
      89: getfield      #45                 // Field e:I
      92: aload_0
      93: getfield      #36                 // Field c:[J
      96: arraylength
      97: if_icmplt     120
     100: aload_0
     101: invokespecial #70                 // Method d:()V
     104: aload_0
     105: getfield      #36                 // Field c:[J
     108: aload_0
     109: getfield      #45                 // Field e:I
     112: lload_1
     113: invokestatic  #66                 // Method android/support/v4/g/c.a:([JIJ)I
     116: iconst_m1
     117: ixor
     118: istore        4
     120: aload_0
     121: getfield      #45                 // Field e:I
     124: aload_0
     125: getfield      #36                 // Field c:[J
     128: arraylength
     129: if_icmplt     200
     132: aload_0
     133: getfield      #45                 // Field e:I
     136: iconst_1
     137: iadd
     138: invokestatic  #43                 // Method android/support/v4/g/c.b:(I)I
     141: istore        5
     143: iload         5
     145: newarray       long
     147: astore        6
     149: iload         5
     151: anewarray     #5                  // class java/lang/Object
     154: astore        7
     156: aload_0
     157: getfield      #36                 // Field c:[J
     160: iconst_0
     161: aload         6
     163: iconst_0
     164: aload_0
     165: getfield      #36                 // Field c:[J
     168: arraylength
     169: invokestatic  #79                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     172: aload_0
     173: getfield      #40                 // Field d:[Ljava/lang/Object;
     176: iconst_0
     177: aload         7
     179: iconst_0
     180: aload_0
     181: getfield      #40                 // Field d:[Ljava/lang/Object;
     184: arraylength
     185: invokestatic  #79                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     188: aload_0
     189: aload         6
     191: putfield      #36                 // Field c:[J
     194: aload_0
     195: aload         7
     197: putfield      #40                 // Field d:[Ljava/lang/Object;
     200: aload_0
     201: getfield      #45                 // Field e:I
     204: iload         4
     206: isub
     207: ifeq          268
     210: aload_0
     211: getfield      #36                 // Field c:[J
     214: astore        6
     216: aload_0
     217: getfield      #36                 // Field c:[J
     220: astore        7
     222: iload         4
     224: iconst_1
     225: iadd
     226: istore        5
     228: aload         6
     230: iload         4
     232: aload         7
     234: iload         5
     236: aload_0
     237: getfield      #45                 // Field e:I
     240: iload         4
     242: isub
     243: invokestatic  #79                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     246: aload_0
     247: getfield      #40                 // Field d:[Ljava/lang/Object;
     250: iload         4
     252: aload_0
     253: getfield      #40                 // Field d:[Ljava/lang/Object;
     256: iload         5
     258: aload_0
     259: getfield      #45                 // Field e:I
     262: iload         4
     264: isub
     265: invokestatic  #79                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     268: aload_0
     269: getfield      #36                 // Field c:[J
     272: iload         4
     274: lload_1
     275: lastore
     276: aload_0
     277: getfield      #40                 // Field d:[Ljava/lang/Object;
     280: iload         4
     282: aload_3
     283: aastore
     284: aload_0
     285: aload_0
     286: getfield      #45                 // Field e:I
     289: iconst_1
     290: iadd
     291: putfield      #45                 // Field e:I
     294: return

  public int c(long);
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #36                 // Field c:[J
      15: aload_0
      16: getfield      #45                 // Field e:I
      19: lload_1
      20: invokestatic  #66                 // Method android/support/v4/g/c.a:([JIJ)I
      23: ireturn

  public E c(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #40                 // Field d:[Ljava/lang/Object;
      15: iload_1
      16: aaload
      17: areturn

  public void c();
    Code:
       0: aload_0
       1: getfield      #45                 // Field e:I
       4: istore_2
       5: aload_0
       6: getfield      #40                 // Field d:[Ljava/lang/Object;
       9: astore_3
      10: iconst_0
      11: istore_1
      12: iload_1
      13: iload_2
      14: if_icmpge     28
      17: aload_3
      18: iload_1
      19: aconst_null
      20: aastore
      21: iload_1
      22: iconst_1
      23: iadd
      24: istore_1
      25: goto          12
      28: aload_0
      29: iconst_0
      30: putfield      #45                 // Field e:I
      33: aload_0
      34: iconst_0
      35: putfield      #30                 // Field b:Z
      38: return

  public java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #85                 // Method a:()Landroid/support/v4/g/f;
       4: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #89                 // Method b:()I
       4: ifgt          10
       7: ldc           #91                 // String {}
       9: areturn
      10: new           #93                 // class java/lang/StringBuilder
      13: dup
      14: aload_0
      15: getfield      #45                 // Field e:I
      18: bipush        28
      20: imul
      21: invokespecial #94                 // Method java/lang/StringBuilder."<init>":(I)V
      24: astore_2
      25: aload_2
      26: bipush        123
      28: invokevirtual #98                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      31: pop
      32: iconst_0
      33: istore_1
      34: iload_1
      35: aload_0
      36: getfield      #45                 // Field e:I
      39: if_icmpge     104
      42: iload_1
      43: ifle          53
      46: aload_2
      47: ldc           #100                // String ,
      49: invokevirtual #103                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_2
      54: aload_0
      55: iload_1
      56: invokevirtual #105                // Method b:(I)J
      59: invokevirtual #108                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      62: pop
      63: aload_2
      64: bipush        61
      66: invokevirtual #98                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      69: pop
      70: aload_0
      71: iload_1
      72: invokevirtual #110                // Method c:(I)Ljava/lang/Object;
      75: astore_3
      76: aload_3
      77: aload_0
      78: if_acmpeq     90
      81: aload_2
      82: aload_3
      83: invokevirtual #113                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      86: pop
      87: goto          97
      90: aload_2
      91: ldc           #115                // String (this Map)
      93: invokevirtual #103                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      96: pop
      97: iload_1
      98: iconst_1
      99: iadd
     100: istore_1
     101: goto          34
     104: aload_2
     105: bipush        125
     107: invokevirtual #98                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     110: pop
     111: aload_2
     112: invokevirtual #117                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     115: areturn
}
