public class android.support.constraint.a extends android.support.constraint.b {
  public android.support.constraint.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #13                 // Method android/support/constraint/b."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: iconst_0
       7: putfield      #15                 // Field f:I
      10: aload_0
      11: iconst_0
      12: putfield      #17                 // Field g:I
      15: aload_0
      16: bipush        8
      18: invokespecial #21                 // Method android/support/constraint/b.setVisibility:(I)V
      21: return

  protected void a(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #26                 // Method android/support/constraint/b.a:(Landroid/util/AttributeSet;)V
       5: aload_0
       6: new           #28                 // class android/support/constraint/a/a/a
       9: dup
      10: invokespecial #31                 // Method android/support/constraint/a/a/a."<init>":()V
      13: putfield      #33                 // Field h:Landroid/support/constraint/a/a/a;
      16: aload_1
      17: ifnull        102
      20: aload_0
      21: invokevirtual #37                 // Method getContext:()Landroid/content/Context;
      24: aload_1
      25: getstatic     #43                 // Field android/support/constraint/f$b.ConstraintLayout_Layout:[I
      28: invokevirtual #49                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      31: astore_1
      32: aload_1
      33: invokevirtual #55                 // Method android/content/res/TypedArray.getIndexCount:()I
      36: istore_3
      37: iconst_0
      38: istore_2
      39: iload_2
      40: iload_3
      41: if_icmpge     102
      44: aload_1
      45: iload_2
      46: invokevirtual #59                 // Method android/content/res/TypedArray.getIndex:(I)I
      49: istore        4
      51: iload         4
      53: getstatic     #62                 // Field android/support/constraint/f$b.ConstraintLayout_Layout_barrierDirection:I
      56: if_icmpne     73
      59: aload_0
      60: aload_1
      61: iload         4
      63: iconst_0
      64: invokevirtual #66                 // Method android/content/res/TypedArray.getInt:(II)I
      67: invokevirtual #69                 // Method setType:(I)V
      70: goto          95
      73: iload         4
      75: getstatic     #72                 // Field android/support/constraint/f$b.ConstraintLayout_Layout_barrierAllowsGoneWidgets:I
      78: if_icmpne     95
      81: aload_0
      82: getfield      #33                 // Field h:Landroid/support/constraint/a/a/a;
      85: aload_1
      86: iload         4
      88: iconst_1
      89: invokevirtual #76                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      92: invokevirtual #79                 // Method android/support/constraint/a/a/a.a:(Z)V
      95: iload_2
      96: iconst_1
      97: iadd
      98: istore_2
      99: goto          39
     102: aload_0
     103: aload_0
     104: getfield      #33                 // Field h:Landroid/support/constraint/a/a/a;
     107: putfield      #83                 // Field d:Landroid/support/constraint/a/a/g;
     110: aload_0
     111: invokevirtual #85                 // Method a:()V
     114: return

  public int getType();
    Code:
       0: aload_0
       1: getfield      #15                 // Field f:I
       4: ireturn

  public void setType(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #15                 // Field f:I
       5: aload_0
       6: iload_1
       7: putfield      #17                 // Field g:I
      10: getstatic     #91                 // Field android/os/Build$VERSION.SDK_INT:I
      13: bipush        17
      15: if_icmpge     51
      18: aload_0
      19: getfield      #15                 // Field f:I
      22: iconst_5
      23: if_icmpne     34
      26: aload_0
      27: iconst_0
      28: putfield      #17                 // Field g:I
      31: goto          122
      34: aload_0
      35: getfield      #15                 // Field f:I
      38: bipush        6
      40: if_icmpne     122
      43: aload_0
      44: iconst_1
      45: putfield      #17                 // Field g:I
      48: goto          122
      51: iconst_1
      52: aload_0
      53: invokevirtual #95                 // Method getResources:()Landroid/content/res/Resources;
      56: invokevirtual #101                // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      59: invokevirtual #106                // Method android/content/res/Configuration.getLayoutDirection:()I
      62: if_icmpne     70
      65: iconst_1
      66: istore_1
      67: goto          72
      70: iconst_0
      71: istore_1
      72: iload_1
      73: ifeq          99
      76: aload_0
      77: getfield      #15                 // Field f:I
      80: iconst_5
      81: if_icmpne     87
      84: goto          43
      87: aload_0
      88: getfield      #15                 // Field f:I
      91: bipush        6
      93: if_icmpne     122
      96: goto          26
      99: aload_0
     100: getfield      #15                 // Field f:I
     103: iconst_5
     104: if_icmpne     110
     107: goto          26
     110: aload_0
     111: getfield      #15                 // Field f:I
     114: bipush        6
     116: if_icmpne     122
     119: goto          43
     122: aload_0
     123: getfield      #33                 // Field h:Landroid/support/constraint/a/a/a;
     126: aload_0
     127: getfield      #17                 // Field g:I
     130: invokevirtual #108                // Method android/support/constraint/a/a/a.a:(I)V
     133: return
}
