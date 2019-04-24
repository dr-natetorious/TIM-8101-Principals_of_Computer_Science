public class android.support.design.internal.BaselineLayout extends android.view.ViewGroup {
  public android.support.design.internal.BaselineLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: iconst_0
       4: invokespecial #11                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: iconst_m1
       9: putfield      #13                 // Field a:I
      12: return

  public android.support.design.internal.BaselineLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #11                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: iconst_m1
       9: putfield      #13                 // Field a:I
      12: return

  public android.support.design.internal.BaselineLayout(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #11                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: iconst_m1
       9: putfield      #13                 // Field a:I
      12: return

  public int getBaseline();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:I
       4: ireturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #22                 // Method getChildCount:()I
       4: istore        7
       6: aload_0
       7: invokevirtual #25                 // Method getPaddingLeft:()I
      10: istore        8
      12: aload_0
      13: invokevirtual #28                 // Method getPaddingRight:()I
      16: istore        9
      18: aload_0
      19: invokevirtual #31                 // Method getPaddingTop:()I
      22: istore        6
      24: iconst_0
      25: istore_3
      26: iload_3
      27: iload         7
      29: if_icmpge     151
      32: aload_0
      33: iload_3
      34: invokevirtual #35                 // Method getChildAt:(I)Landroid/view/View;
      37: astore        13
      39: aload         13
      41: invokevirtual #40                 // Method android/view/View.getVisibility:()I
      44: bipush        8
      46: if_icmpne     52
      49: goto          144
      52: aload         13
      54: invokevirtual #43                 // Method android/view/View.getMeasuredWidth:()I
      57: istore        10
      59: aload         13
      61: invokevirtual #46                 // Method android/view/View.getMeasuredHeight:()I
      64: istore        11
      66: iload         4
      68: iload_2
      69: isub
      70: iload         9
      72: isub
      73: iload         8
      75: isub
      76: iload         10
      78: isub
      79: iconst_2
      80: idiv
      81: iload         8
      83: iadd
      84: istore        12
      86: aload_0
      87: getfield      #13                 // Field a:I
      90: iconst_m1
      91: if_icmpeq     121
      94: aload         13
      96: invokevirtual #48                 // Method android/view/View.getBaseline:()I
      99: iconst_m1
     100: if_icmpeq     121
     103: aload_0
     104: getfield      #13                 // Field a:I
     107: iload         6
     109: iadd
     110: aload         13
     112: invokevirtual #48                 // Method android/view/View.getBaseline:()I
     115: isub
     116: istore        5
     118: goto          125
     121: iload         6
     123: istore        5
     125: aload         13
     127: iload         12
     129: iload         5
     131: iload         10
     133: iload         12
     135: iadd
     136: iload         11
     138: iload         5
     140: iadd
     141: invokevirtual #52                 // Method android/view/View.layout:(IIII)V
     144: iload_3
     145: iconst_1
     146: iadd
     147: istore_3
     148: goto          26
     151: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #22                 // Method getChildCount:()I
       4: istore        11
       6: iconst_0
       7: istore        10
       9: iconst_m1
      10: istore        5
      12: iconst_m1
      13: istore        4
      15: iconst_0
      16: istore_3
      17: iconst_0
      18: istore        9
      20: iconst_0
      21: istore        8
      23: iload         10
      25: iload         11
      27: if_icmpge     155
      30: aload_0
      31: iload         10
      33: invokevirtual #35                 // Method getChildAt:(I)Landroid/view/View;
      36: astore        13
      38: aload         13
      40: invokevirtual #40                 // Method android/view/View.getVisibility:()I
      43: bipush        8
      45: if_icmpne     51
      48: goto          146
      51: aload_0
      52: aload         13
      54: iload_1
      55: iload_2
      56: invokevirtual #58                 // Method measureChild:(Landroid/view/View;II)V
      59: aload         13
      61: invokevirtual #48                 // Method android/view/View.getBaseline:()I
      64: istore        12
      66: iload         5
      68: istore        6
      70: iload         4
      72: istore        7
      74: iload         12
      76: iconst_m1
      77: if_icmpeq     104
      80: iload         5
      82: iload         12
      84: invokestatic  #64                 // Method java/lang/Math.max:(II)I
      87: istore        6
      89: iload         4
      91: aload         13
      93: invokevirtual #46                 // Method android/view/View.getMeasuredHeight:()I
      96: iload         12
      98: isub
      99: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     102: istore        7
     104: iload         9
     106: aload         13
     108: invokevirtual #43                 // Method android/view/View.getMeasuredWidth:()I
     111: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     114: istore        9
     116: iload_3
     117: aload         13
     119: invokevirtual #46                 // Method android/view/View.getMeasuredHeight:()I
     122: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     125: istore_3
     126: iload         8
     128: aload         13
     130: invokevirtual #67                 // Method android/view/View.getMeasuredState:()I
     133: invokestatic  #70                 // Method android/view/View.combineMeasuredStates:(II)I
     136: istore        8
     138: iload         7
     140: istore        4
     142: iload         6
     144: istore        5
     146: iload         10
     148: iconst_1
     149: iadd
     150: istore        10
     152: goto          23
     155: iload_3
     156: istore        6
     158: iload         5
     160: iconst_m1
     161: if_icmpeq     188
     164: iload_3
     165: iload         4
     167: aload_0
     168: invokevirtual #73                 // Method getPaddingBottom:()I
     171: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     174: iload         5
     176: iadd
     177: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     180: istore        6
     182: aload_0
     183: iload         5
     185: putfield      #13                 // Field a:I
     188: iload         6
     190: aload_0
     191: invokevirtual #76                 // Method getSuggestedMinimumHeight:()I
     194: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     197: istore_3
     198: aload_0
     199: iload         9
     201: aload_0
     202: invokevirtual #79                 // Method getSuggestedMinimumWidth:()I
     205: invokestatic  #64                 // Method java/lang/Math.max:(II)I
     208: iload_1
     209: iload         8
     211: invokestatic  #83                 // Method android/view/View.resolveSizeAndState:(III)I
     214: iload_3
     215: iload_2
     216: iload         8
     218: bipush        16
     220: ishl
     221: invokestatic  #83                 // Method android/view/View.resolveSizeAndState:(III)I
     224: invokevirtual #86                 // Method setMeasuredDimension:(II)V
     227: return
}
