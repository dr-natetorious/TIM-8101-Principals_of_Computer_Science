public class android.support.v4.g.n<E> implements java.lang.Cloneable {
  static {};
    Code:
       0: new           #5                  // class java/lang/Object
       3: dup
       4: invokespecial #22                 // Method java/lang/Object."<init>":()V
       7: putstatic     #24                 // Field a:Ljava/lang/Object;
      10: return

  public android.support.v4.g.n();
    Code:
       0: aload_0
       1: bipush        10
       3: invokespecial #28                 // Method "<init>":(I)V
       6: return

  public android.support.v4.g.n(int);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #30                 // Field b:Z
       9: iload_1
      10: ifne          32
      13: aload_0
      14: getstatic     #34                 // Field android/support/v4/g/c.a:[I
      17: putfield      #36                 // Field c:[I
      20: getstatic     #38                 // Field android/support/v4/g/c.c:[Ljava/lang/Object;
      23: astore_2
      24: aload_0
      25: aload_2
      26: putfield      #40                 // Field d:[Ljava/lang/Object;
      29: goto          52
      32: iload_1
      33: invokestatic  #43                 // Method android/support/v4/g/c.a:(I)I
      36: istore_1
      37: aload_0
      38: iload_1
      39: newarray       int
      41: putfield      #36                 // Field c:[I
      44: iload_1
      45: anewarray     #5                  // class java/lang/Object
      48: astore_2
      49: goto          24
      52: aload_0
      53: iconst_0
      54: putfield      #45                 // Field e:I
      57: return

  public android.support.v4.g.n<E> a();
    Code:
       0: aload_0
       1: invokespecial #52                 // Method java/lang/Object.clone:()Ljava/lang/Object;
       4: checkcast     #2                  // class android/support/v4/g/n
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field c:[I
      13: invokevirtual #54                 // Method "[I".clone:()Ljava/lang/Object;
      16: checkcast     #53                 // class "[I"
      19: putfield      #36                 // Field c:[I
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

  public E a(int);
    Code:
       0: aload_0
       1: iload_1
       2: aconst_null
       3: invokevirtual #62                 // Method a:(ILjava/lang/Object;)Ljava/lang/Object;
       6: areturn

  public E a(int, E);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[I
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: iload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([III)I
      12: istore_1
      13: iload_1
      14: iflt          38
      17: aload_0
      18: getfield      #40                 // Field d:[Ljava/lang/Object;
      21: iload_1
      22: aaload
      23: getstatic     #24                 // Field a:Ljava/lang/Object;
      26: if_acmpne     31
      29: aload_2
      30: areturn
      31: aload_0
      32: getfield      #40                 // Field d:[Ljava/lang/Object;
      35: iload_1
      36: aaload
      37: areturn
      38: aload_2
      39: areturn

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

  public void b(int);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[I
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: iload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([III)I
      12: istore_1
      13: iload_1
      14: iflt          43
      17: aload_0
      18: getfield      #40                 // Field d:[Ljava/lang/Object;
      21: iload_1
      22: aaload
      23: getstatic     #24                 // Field a:Ljava/lang/Object;
      26: if_acmpeq     43
      29: aload_0
      30: getfield      #40                 // Field d:[Ljava/lang/Object;
      33: iload_1
      34: getstatic     #24                 // Field a:Ljava/lang/Object;
      37: aastore
      38: aload_0
      39: iconst_1
      40: putfield      #30                 // Field b:Z
      43: return

  public void b(int, E);
    Code:
       0: aload_0
       1: getfield      #36                 // Field c:[I
       4: aload_0
       5: getfield      #45                 // Field e:I
       8: iload_1
       9: invokestatic  #66                 // Method android/support/v4/g/c.a:([III)I
      12: istore_3
      13: iload_3
      14: iflt          25
      17: aload_0
      18: getfield      #40                 // Field d:[Ljava/lang/Object;
      21: iload_3
      22: aload_2
      23: aastore
      24: return
      25: iload_3
      26: iconst_m1
      27: ixor
      28: istore        4
      30: iload         4
      32: aload_0
      33: getfield      #45                 // Field e:I
      36: if_icmpge     69
      39: aload_0
      40: getfield      #40                 // Field d:[Ljava/lang/Object;
      43: iload         4
      45: aaload
      46: getstatic     #24                 // Field a:Ljava/lang/Object;
      49: if_acmpne     69
      52: aload_0
      53: getfield      #36                 // Field c:[I
      56: iload         4
      58: iload_1
      59: iastore
      60: aload_0
      61: getfield      #40                 // Field d:[Ljava/lang/Object;
      64: iload         4
      66: aload_2
      67: aastore
      68: return
      69: iload         4
      71: istore_3
      72: aload_0
      73: getfield      #30                 // Field b:Z
      76: ifeq          113
      79: iload         4
      81: istore_3
      82: aload_0
      83: getfield      #45                 // Field e:I
      86: aload_0
      87: getfield      #36                 // Field c:[I
      90: arraylength
      91: if_icmplt     113
      94: aload_0
      95: invokespecial #70                 // Method d:()V
      98: aload_0
      99: getfield      #36                 // Field c:[I
     102: aload_0
     103: getfield      #45                 // Field e:I
     106: iload_1
     107: invokestatic  #66                 // Method android/support/v4/g/c.a:([III)I
     110: iconst_m1
     111: ixor
     112: istore_3
     113: aload_0
     114: getfield      #45                 // Field e:I
     117: aload_0
     118: getfield      #36                 // Field c:[I
     121: arraylength
     122: if_icmplt     193
     125: aload_0
     126: getfield      #45                 // Field e:I
     129: iconst_1
     130: iadd
     131: invokestatic  #43                 // Method android/support/v4/g/c.a:(I)I
     134: istore        4
     136: iload         4
     138: newarray       int
     140: astore        5
     142: iload         4
     144: anewarray     #5                  // class java/lang/Object
     147: astore        6
     149: aload_0
     150: getfield      #36                 // Field c:[I
     153: iconst_0
     154: aload         5
     156: iconst_0
     157: aload_0
     158: getfield      #36                 // Field c:[I
     161: arraylength
     162: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     165: aload_0
     166: getfield      #40                 // Field d:[Ljava/lang/Object;
     169: iconst_0
     170: aload         6
     172: iconst_0
     173: aload_0
     174: getfield      #40                 // Field d:[Ljava/lang/Object;
     177: arraylength
     178: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     181: aload_0
     182: aload         5
     184: putfield      #36                 // Field c:[I
     187: aload_0
     188: aload         6
     190: putfield      #40                 // Field d:[Ljava/lang/Object;
     193: aload_0
     194: getfield      #45                 // Field e:I
     197: iload_3
     198: isub
     199: ifeq          255
     202: aload_0
     203: getfield      #36                 // Field c:[I
     206: astore        5
     208: aload_0
     209: getfield      #36                 // Field c:[I
     212: astore        6
     214: iload_3
     215: iconst_1
     216: iadd
     217: istore        4
     219: aload         5
     221: iload_3
     222: aload         6
     224: iload         4
     226: aload_0
     227: getfield      #45                 // Field e:I
     230: iload_3
     231: isub
     232: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     235: aload_0
     236: getfield      #40                 // Field d:[Ljava/lang/Object;
     239: iload_3
     240: aload_0
     241: getfield      #40                 // Field d:[Ljava/lang/Object;
     244: iload         4
     246: aload_0
     247: getfield      #45                 // Field e:I
     250: iload_3
     251: isub
     252: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     255: aload_0
     256: getfield      #36                 // Field c:[I
     259: iload_3
     260: iload_1
     261: iastore
     262: aload_0
     263: getfield      #40                 // Field d:[Ljava/lang/Object;
     266: iload_3
     267: aload_2
     268: aastore
     269: aload_0
     270: aload_0
     271: getfield      #45                 // Field e:I
     274: iconst_1
     275: iadd
     276: putfield      #45                 // Field e:I
     279: return

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

  public void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #80                 // Method b:(I)V
       5: return

  public void c(int, E);
    Code:
       0: aload_0
       1: getfield      #45                 // Field e:I
       4: ifeq          29
       7: iload_1
       8: aload_0
       9: getfield      #36                 // Field c:[I
      12: aload_0
      13: getfield      #45                 // Field e:I
      16: iconst_1
      17: isub
      18: iaload
      19: if_icmpgt     29
      22: aload_0
      23: iload_1
      24: aload_2
      25: invokevirtual #82                 // Method b:(ILjava/lang/Object;)V
      28: return
      29: aload_0
      30: getfield      #30                 // Field b:Z
      33: ifeq          52
      36: aload_0
      37: getfield      #45                 // Field e:I
      40: aload_0
      41: getfield      #36                 // Field c:[I
      44: arraylength
      45: if_icmplt     52
      48: aload_0
      49: invokespecial #70                 // Method d:()V
      52: aload_0
      53: getfield      #45                 // Field e:I
      56: istore_3
      57: iload_3
      58: aload_0
      59: getfield      #36                 // Field c:[I
      62: arraylength
      63: if_icmplt     131
      66: iload_3
      67: iconst_1
      68: iadd
      69: invokestatic  #43                 // Method android/support/v4/g/c.a:(I)I
      72: istore        4
      74: iload         4
      76: newarray       int
      78: astore        5
      80: iload         4
      82: anewarray     #5                  // class java/lang/Object
      85: astore        6
      87: aload_0
      88: getfield      #36                 // Field c:[I
      91: iconst_0
      92: aload         5
      94: iconst_0
      95: aload_0
      96: getfield      #36                 // Field c:[I
      99: arraylength
     100: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     103: aload_0
     104: getfield      #40                 // Field d:[Ljava/lang/Object;
     107: iconst_0
     108: aload         6
     110: iconst_0
     111: aload_0
     112: getfield      #40                 // Field d:[Ljava/lang/Object;
     115: arraylength
     116: invokestatic  #77                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     119: aload_0
     120: aload         5
     122: putfield      #36                 // Field c:[I
     125: aload_0
     126: aload         6
     128: putfield      #40                 // Field d:[Ljava/lang/Object;
     131: aload_0
     132: getfield      #36                 // Field c:[I
     135: iload_3
     136: iload_1
     137: iastore
     138: aload_0
     139: getfield      #40                 // Field d:[Ljava/lang/Object;
     142: iload_3
     143: aload_2
     144: aastore
     145: aload_0
     146: iload_3
     147: iconst_1
     148: iadd
     149: putfield      #45                 // Field e:I
     152: return

  public java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #84                 // Method a:()Landroid/support/v4/g/n;
       4: areturn

  public int d(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #36                 // Field c:[I
      15: iload_1
      16: iaload
      17: ireturn

  public E e(int);
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

  public int f(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #70                 // Method d:()V
      11: aload_0
      12: getfield      #36                 // Field c:[I
      15: aload_0
      16: getfield      #45                 // Field e:I
      19: iload_1
      20: invokestatic  #66                 // Method android/support/v4/g/c.a:([III)I
      23: ireturn

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
      56: invokevirtual #105                // Method d:(I)I
      59: invokevirtual #108                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      62: pop
      63: aload_2
      64: bipush        61
      66: invokevirtual #98                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      69: pop
      70: aload_0
      71: iload_1
      72: invokevirtual #110                // Method e:(I)Ljava/lang/Object;
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
