public abstract class android.support.constraint.b extends android.view.View {
  protected int[] a;

  protected int b;

  protected android.content.Context c;

  protected android.support.constraint.a.a.g d;

  protected boolean e;

  public android.support.constraint.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #20                 // Method android/view/View."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: bipush        32
       8: newarray       int
      10: putfield      #22                 // Field a:[I
      13: aload_0
      14: iconst_0
      15: putfield      #24                 // Field b:I
      18: aload_0
      19: aconst_null
      20: putfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      23: aload_0
      24: iconst_0
      25: putfield      #28                 // Field e:Z
      28: aload_0
      29: aload_1
      30: putfield      #30                 // Field c:Landroid/content/Context;
      33: aload_0
      34: aconst_null
      35: invokevirtual #33                 // Method a:(Landroid/util/AttributeSet;)V
      38: return

  public android.support.constraint.b(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #37                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: bipush        32
       9: newarray       int
      11: putfield      #22                 // Field a:[I
      14: aload_0
      15: iconst_0
      16: putfield      #24                 // Field b:I
      19: aload_0
      20: aconst_null
      21: putfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      24: aload_0
      25: iconst_0
      26: putfield      #28                 // Field e:Z
      29: aload_0
      30: aload_1
      31: putfield      #30                 // Field c:Landroid/content/Context;
      34: aload_0
      35: aload_2
      36: invokevirtual #33                 // Method a:(Landroid/util/AttributeSet;)V
      39: return

  public android.support.constraint.b(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #40                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: bipush        32
      10: newarray       int
      12: putfield      #22                 // Field a:[I
      15: aload_0
      16: iconst_0
      17: putfield      #24                 // Field b:I
      20: aload_0
      21: aconst_null
      22: putfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      25: aload_0
      26: iconst_0
      27: putfield      #28                 // Field e:Z
      30: aload_0
      31: aload_1
      32: putfield      #30                 // Field c:Landroid/content/Context;
      35: aload_0
      36: aload_2
      37: invokevirtual #33                 // Method a:(Landroid/util/AttributeSet;)V
      40: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
       4: ifnonnull     8
       7: return
       8: aload_0
       9: invokevirtual #145                // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      12: astore_1
      13: aload_1
      14: instanceof    #147                // class android/support/constraint/ConstraintLayout$a
      17: ifeq          31
      20: aload_1
      21: checkcast     #147                // class android/support/constraint/ConstraintLayout$a
      24: aload_0
      25: getfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      28: putfield      #151                // Field android/support/constraint/ConstraintLayout$a.al:Landroid/support/constraint/a/a/d;
      31: return

  public void a(android.support.constraint.ConstraintLayout);
    Code:
       0: aload_0
       1: invokevirtual #84                 // Method isInEditMode:()Z
       4: ifeq          15
       7: aload_0
       8: aload_0
       9: getfield      #154                // Field f:Ljava/lang/String;
      12: invokespecial #156                // Method setIds:(Ljava/lang/String;)V
      15: aload_0
      16: getfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      19: ifnonnull     23
      22: return
      23: aload_0
      24: getfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      27: invokevirtual #161                // Method android/support/constraint/a/a/g.H:()V
      30: iconst_0
      31: istore_2
      32: iload_2
      33: aload_0
      34: getfield      #24                 // Field b:I
      37: if_icmpge     74
      40: aload_1
      41: aload_0
      42: getfield      #22                 // Field a:[I
      45: iload_2
      46: iaload
      47: invokevirtual #165                // Method android/support/constraint/ConstraintLayout.findViewById:(I)Landroid/view/View;
      50: astore_3
      51: aload_3
      52: ifnull        67
      55: aload_0
      56: getfield      #26                 // Field d:Landroid/support/constraint/a/a/g;
      59: aload_1
      60: aload_3
      61: invokevirtual #168                // Method android/support/constraint/ConstraintLayout.a:(Landroid/view/View;)Landroid/support/constraint/a/a/d;
      64: invokevirtual #171                // Method android/support/constraint/a/a/g.b:(Landroid/support/constraint/a/a/d;)V
      67: iload_2
      68: iconst_1
      69: iadd
      70: istore_2
      71: goto          32
      74: return

  protected void a(android.util.AttributeSet);
    Code:
       0: aload_1
       1: ifnull        68
       4: aload_0
       5: invokevirtual #175                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: getstatic     #180                // Field android/support/constraint/f$b.ConstraintLayout_Layout:[I
      12: invokevirtual #184                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      15: astore_1
      16: aload_1
      17: invokevirtual #189                // Method android/content/res/TypedArray.getIndexCount:()I
      20: istore_3
      21: iconst_0
      22: istore_2
      23: iload_2
      24: iload_3
      25: if_icmpge     68
      28: aload_1
      29: iload_2
      30: invokevirtual #193                // Method android/content/res/TypedArray.getIndex:(I)I
      33: istore        4
      35: iload         4
      37: getstatic     #196                // Field android/support/constraint/f$b.ConstraintLayout_Layout_constraint_referenced_ids:I
      40: if_icmpne     61
      43: aload_0
      44: aload_1
      45: iload         4
      47: invokevirtual #199                // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
      50: putfield      #154                // Field f:Ljava/lang/String;
      53: aload_0
      54: aload_0
      55: getfield      #154                // Field f:Ljava/lang/String;
      58: invokespecial #156                // Method setIds:(Ljava/lang/String;)V
      61: iload_2
      62: iconst_1
      63: iadd
      64: istore_2
      65: goto          23
      68: return

  public void b(android.support.constraint.ConstraintLayout);
    Code:
       0: return

  public void c(android.support.constraint.ConstraintLayout);
    Code:
       0: return

  public int[] getReferencedIds();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:[I
       4: aload_0
       5: getfield      #24                 // Field b:I
       8: invokestatic  #207                // Method java/util/Arrays.copyOf:([II)[I
      11: areturn

  public void onDraw(android.graphics.Canvas);
    Code:
       0: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: getfield      #28                 // Field e:Z
       4: ifeq          14
       7: aload_0
       8: iload_1
       9: iload_2
      10: invokespecial #213                // Method android/view/View.onMeasure:(II)V
      13: return
      14: aload_0
      15: iconst_0
      16: iconst_0
      17: invokevirtual #216                // Method setMeasuredDimension:(II)V
      20: return

  public void setReferencedIds(int[]);
    Code:
       0: iconst_0
       1: istore_2
       2: aload_0
       3: iconst_0
       4: putfield      #24                 // Field b:I
       7: iload_2
       8: aload_1
       9: arraylength
      10: if_icmpge     28
      13: aload_0
      14: aload_1
      15: iload_2
      16: iaload
      17: aconst_null
      18: invokevirtual #103                // Method setTag:(ILjava/lang/Object;)V
      21: iload_2
      22: iconst_1
      23: iadd
      24: istore_2
      25: goto          7
      28: return

  public void setTag(int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:I
       4: iconst_1
       5: iadd
       6: aload_0
       7: getfield      #22                 // Field a:[I
      10: arraylength
      11: if_icmple     32
      14: aload_0
      15: aload_0
      16: getfield      #22                 // Field a:[I
      19: aload_0
      20: getfield      #22                 // Field a:[I
      23: arraylength
      24: iconst_2
      25: imul
      26: invokestatic  #207                // Method java/util/Arrays.copyOf:([II)[I
      29: putfield      #22                 // Field a:[I
      32: aload_0
      33: getfield      #22                 // Field a:[I
      36: aload_0
      37: getfield      #24                 // Field b:I
      40: iload_1
      41: iastore
      42: aload_0
      43: aload_0
      44: getfield      #24                 // Field b:I
      47: iconst_1
      48: iadd
      49: putfield      #24                 // Field b:I
      52: return
}
