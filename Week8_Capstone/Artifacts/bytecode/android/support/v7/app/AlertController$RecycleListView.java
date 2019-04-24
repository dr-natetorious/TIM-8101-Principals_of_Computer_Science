public class android.support.v7.app.AlertController$RecycleListView extends android.widget.ListView {
  public android.support.v7.app.AlertController$RecycleListView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.app.AlertController$RecycleListView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #17                 // Method android/widget/ListView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #22                 // Field android/support/v7/a/a$j.RecycleListView:[I
      11: invokevirtual #28                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_0
      16: aload_1
      17: getstatic     #31                 // Field android/support/v7/a/a$j.RecycleListView_paddingBottomNoButtons:I
      20: iconst_m1
      21: invokevirtual #37                 // Method android/content/res/TypedArray.getDimensionPixelOffset:(II)I
      24: putfield      #39                 // Field b:I
      27: aload_0
      28: aload_1
      29: getstatic     #42                 // Field android/support/v7/a/a$j.RecycleListView_paddingTopNoTitle:I
      32: iconst_m1
      33: invokevirtual #37                 // Method android/content/res/TypedArray.getDimensionPixelOffset:(II)I
      36: putfield      #44                 // Field a:I
      39: return

  public void a(boolean, boolean);
    Code:
       0: iload_2
       1: ifeq          8
       4: iload_1
       5: ifne          67
       8: aload_0
       9: invokevirtual #49                 // Method getPaddingLeft:()I
      12: istore        5
      14: iload_1
      15: ifeq          26
      18: aload_0
      19: invokevirtual #52                 // Method getPaddingTop:()I
      22: istore_3
      23: goto          31
      26: aload_0
      27: getfield      #44                 // Field a:I
      30: istore_3
      31: aload_0
      32: invokevirtual #55                 // Method getPaddingRight:()I
      35: istore        6
      37: iload_2
      38: ifeq          50
      41: aload_0
      42: invokevirtual #58                 // Method getPaddingBottom:()I
      45: istore        4
      47: goto          56
      50: aload_0
      51: getfield      #39                 // Field b:I
      54: istore        4
      56: aload_0
      57: iload         5
      59: iload_3
      60: iload         6
      62: iload         4
      64: invokevirtual #62                 // Method setPadding:(IIII)V
      67: return
}
