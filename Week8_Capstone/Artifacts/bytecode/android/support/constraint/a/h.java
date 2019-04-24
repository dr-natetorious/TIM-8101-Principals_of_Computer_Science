public class android.support.constraint.a.h {
  public int a;

  int b;

  public int c;

  public float d;

  float[] e;

  android.support.constraint.a.h$a f;

  android.support.constraint.a.b[] g;

  int h;

  public int i;

  static {};
    Code:
       0: return

  public android.support.constraint.a.h(android.support.constraint.a.h$a, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #35                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #37                 // Field a:I
       9: aload_0
      10: iconst_m1
      11: putfield      #39                 // Field b:I
      14: aload_0
      15: iconst_0
      16: putfield      #41                 // Field c:I
      19: aload_0
      20: bipush        7
      22: newarray       float
      24: putfield      #43                 // Field e:[F
      27: aload_0
      28: bipush        8
      30: anewarray     #45                 // class android/support/constraint/a/b
      33: putfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      36: aload_0
      37: iconst_0
      38: putfield      #49                 // Field h:I
      41: aload_0
      42: iconst_0
      43: putfield      #51                 // Field i:I
      46: aload_0
      47: aload_1
      48: putfield      #53                 // Field f:Landroid/support/constraint/a/h$a;
      51: return

  static void a();
    Code:
       0: getstatic     #55                 // Field k:I
       3: iconst_1
       4: iadd
       5: putstatic     #55                 // Field k:I
       8: return

  public final void a(android.support.constraint.a.b);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #49                 // Field h:I
       7: if_icmpge     28
      10: aload_0
      11: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      14: iload_2
      15: aaload
      16: aload_1
      17: if_acmpne     21
      20: return
      21: iload_2
      22: iconst_1
      23: iadd
      24: istore_2
      25: goto          2
      28: aload_0
      29: getfield      #49                 // Field h:I
      32: aload_0
      33: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      36: arraylength
      37: if_icmplt     61
      40: aload_0
      41: aload_0
      42: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      45: aload_0
      46: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      49: arraylength
      50: iconst_2
      51: imul
      52: invokestatic  #62                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      55: checkcast     #63                 // class "[Landroid/support/constraint/a/b;"
      58: putfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      61: aload_0
      62: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      65: aload_0
      66: getfield      #49                 // Field h:I
      69: aload_1
      70: aastore
      71: aload_0
      72: aload_0
      73: getfield      #49                 // Field h:I
      76: iconst_1
      77: iadd
      78: putfield      #49                 // Field h:I
      81: return

  public void a(android.support.constraint.a.h$a, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #53                 // Field f:Landroid/support/constraint/a/h$a;
       5: return

  public void b();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #65                 // Field o:Ljava/lang/String;
       5: aload_0
       6: getstatic     #67                 // Field android/support/constraint/a/h$a.e:Landroid/support/constraint/a/h$a;
       9: putfield      #53                 // Field f:Landroid/support/constraint/a/h$a;
      12: aload_0
      13: iconst_0
      14: putfield      #41                 // Field c:I
      17: aload_0
      18: iconst_m1
      19: putfield      #37                 // Field a:I
      22: aload_0
      23: iconst_m1
      24: putfield      #39                 // Field b:I
      27: aload_0
      28: fconst_0
      29: putfield      #69                 // Field d:F
      32: aload_0
      33: iconst_0
      34: putfield      #49                 // Field h:I
      37: aload_0
      38: iconst_0
      39: putfield      #51                 // Field i:I
      42: return

  public final void b(android.support.constraint.a.b);
    Code:
       0: aload_0
       1: getfield      #49                 // Field h:I
       4: istore        4
       6: iconst_0
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload         4
      13: if_icmpge     84
      16: aload_0
      17: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      20: iload_2
      21: aaload
      22: aload_1
      23: if_acmpne     77
      26: iload_3
      27: iload         4
      29: iload_2
      30: isub
      31: iconst_1
      32: isub
      33: if_icmpge     66
      36: aload_0
      37: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      40: astore_1
      41: iload_2
      42: iload_3
      43: iadd
      44: istore        5
      46: aload_1
      47: iload         5
      49: aload_0
      50: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      53: iload         5
      55: iconst_1
      56: iadd
      57: aaload
      58: aastore
      59: iload_3
      60: iconst_1
      61: iadd
      62: istore_3
      63: goto          26
      66: aload_0
      67: aload_0
      68: getfield      #49                 // Field h:I
      71: iconst_1
      72: isub
      73: putfield      #49                 // Field h:I
      76: return
      77: iload_2
      78: iconst_1
      79: iadd
      80: istore_2
      81: goto          10
      84: return

  public final void c(android.support.constraint.a.b);
    Code:
       0: aload_0
       1: getfield      #49                 // Field h:I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     39
      12: aload_0
      13: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      16: iload_2
      17: aaload
      18: getfield      #72                 // Field android/support/constraint/a/b.d:Landroid/support/constraint/a/a;
      21: aload_0
      22: getfield      #47                 // Field g:[Landroid/support/constraint/a/b;
      25: iload_2
      26: aaload
      27: aload_1
      28: iconst_0
      29: invokevirtual #77                 // Method android/support/constraint/a/a.a:(Landroid/support/constraint/a/b;Landroid/support/constraint/a/b;Z)V
      32: iload_2
      33: iconst_1
      34: iadd
      35: istore_2
      36: goto          7
      39: aload_0
      40: iconst_0
      41: putfield      #49                 // Field h:I
      44: return

  public java.lang.String toString();
    Code:
       0: new           #81                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #82                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #84                 // String
      11: invokevirtual #88                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #65                 // Field o:Ljava/lang/String;
      20: invokevirtual #88                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: invokevirtual #90                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      28: areturn
}
