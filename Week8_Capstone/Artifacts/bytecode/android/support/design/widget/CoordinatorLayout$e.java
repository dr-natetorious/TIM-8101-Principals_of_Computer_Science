public class android.support.design.widget.CoordinatorLayout$e extends android.view.ViewGroup$MarginLayoutParams {
  android.support.design.widget.CoordinatorLayout$b a;

  boolean b;

  public int c;

  public int d;

  public int e;

  int f;

  public int g;

  public int h;

  int i;

  int j;

  android.view.View k;

  android.view.View l;

  final android.graphics.Rect m;

  java.lang.Object n;

  public android.support.design.widget.CoordinatorLayout$e(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #34                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_0
       8: putfield      #36                 // Field b:Z
      11: aload_0
      12: iconst_0
      13: putfield      #38                 // Field c:I
      16: aload_0
      17: iconst_0
      18: putfield      #40                 // Field d:I
      21: aload_0
      22: iconst_m1
      23: putfield      #42                 // Field e:I
      26: aload_0
      27: iconst_m1
      28: putfield      #44                 // Field f:I
      31: aload_0
      32: iconst_0
      33: putfield      #46                 // Field g:I
      36: aload_0
      37: iconst_0
      38: putfield      #48                 // Field h:I
      41: aload_0
      42: new           #50                 // class android/graphics/Rect
      45: dup
      46: invokespecial #53                 // Method android/graphics/Rect."<init>":()V
      49: putfield      #55                 // Field m:Landroid/graphics/Rect;
      52: return

  android.support.design.widget.CoordinatorLayout$e(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #59                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #36                 // Field b:Z
      11: aload_0
      12: iconst_0
      13: putfield      #38                 // Field c:I
      16: aload_0
      17: iconst_0
      18: putfield      #40                 // Field d:I
      21: aload_0
      22: iconst_m1
      23: putfield      #42                 // Field e:I
      26: aload_0
      27: iconst_m1
      28: putfield      #44                 // Field f:I
      31: aload_0
      32: iconst_0
      33: putfield      #46                 // Field g:I
      36: aload_0
      37: iconst_0
      38: putfield      #48                 // Field h:I
      41: aload_0
      42: new           #50                 // class android/graphics/Rect
      45: dup
      46: invokespecial #53                 // Method android/graphics/Rect."<init>":()V
      49: putfield      #55                 // Field m:Landroid/graphics/Rect;
      52: aload_1
      53: aload_2
      54: getstatic     #65                 // Field android/support/b/a$c.CoordinatorLayout_Layout:[I
      57: invokevirtual #71                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      60: astore_3
      61: aload_0
      62: aload_3
      63: getstatic     #74                 // Field android/support/b/a$c.CoordinatorLayout_Layout_android_layout_gravity:I
      66: iconst_0
      67: invokevirtual #80                 // Method android/content/res/TypedArray.getInteger:(II)I
      70: putfield      #38                 // Field c:I
      73: aload_0
      74: aload_3
      75: getstatic     #83                 // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_anchor:I
      78: iconst_m1
      79: invokevirtual #86                 // Method android/content/res/TypedArray.getResourceId:(II)I
      82: putfield      #44                 // Field f:I
      85: aload_0
      86: aload_3
      87: getstatic     #89                 // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_anchorGravity:I
      90: iconst_0
      91: invokevirtual #80                 // Method android/content/res/TypedArray.getInteger:(II)I
      94: putfield      #40                 // Field d:I
      97: aload_0
      98: aload_3
      99: getstatic     #92                 // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_keyline:I
     102: iconst_m1
     103: invokevirtual #80                 // Method android/content/res/TypedArray.getInteger:(II)I
     106: putfield      #42                 // Field e:I
     109: aload_0
     110: aload_3
     111: getstatic     #95                 // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_insetEdge:I
     114: iconst_0
     115: invokevirtual #98                 // Method android/content/res/TypedArray.getInt:(II)I
     118: putfield      #46                 // Field g:I
     121: aload_0
     122: aload_3
     123: getstatic     #101                // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_dodgeInsetEdges:I
     126: iconst_0
     127: invokevirtual #98                 // Method android/content/res/TypedArray.getInt:(II)I
     130: putfield      #48                 // Field h:I
     133: aload_0
     134: aload_3
     135: getstatic     #104                // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_behavior:I
     138: invokevirtual #108                // Method android/content/res/TypedArray.hasValue:(I)Z
     141: putfield      #36                 // Field b:Z
     144: aload_0
     145: getfield      #36                 // Field b:Z
     148: ifeq          167
     151: aload_0
     152: aload_1
     153: aload_2
     154: aload_3
     155: getstatic     #104                // Field android/support/b/a$c.CoordinatorLayout_Layout_layout_behavior:I
     158: invokevirtual #112                // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
     161: invokestatic  #115                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Landroid/support/design/widget/CoordinatorLayout$b;
     164: putfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
     167: aload_3
     168: invokevirtual #120                // Method android/content/res/TypedArray.recycle:()V
     171: aload_0
     172: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
     175: ifnull        186
     178: aload_0
     179: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
     182: aload_0
     183: invokevirtual #125                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout$e;)V
     186: return

  public android.support.design.widget.CoordinatorLayout$e(android.support.design.widget.CoordinatorLayout$e);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #128                // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #36                 // Field b:Z
      10: aload_0
      11: iconst_0
      12: putfield      #38                 // Field c:I
      15: aload_0
      16: iconst_0
      17: putfield      #40                 // Field d:I
      20: aload_0
      21: iconst_m1
      22: putfield      #42                 // Field e:I
      25: aload_0
      26: iconst_m1
      27: putfield      #44                 // Field f:I
      30: aload_0
      31: iconst_0
      32: putfield      #46                 // Field g:I
      35: aload_0
      36: iconst_0
      37: putfield      #48                 // Field h:I
      40: aload_0
      41: new           #50                 // class android/graphics/Rect
      44: dup
      45: invokespecial #53                 // Method android/graphics/Rect."<init>":()V
      48: putfield      #55                 // Field m:Landroid/graphics/Rect;
      51: return

  public android.support.design.widget.CoordinatorLayout$e(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #131                // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #36                 // Field b:Z
      10: aload_0
      11: iconst_0
      12: putfield      #38                 // Field c:I
      15: aload_0
      16: iconst_0
      17: putfield      #40                 // Field d:I
      20: aload_0
      21: iconst_m1
      22: putfield      #42                 // Field e:I
      25: aload_0
      26: iconst_m1
      27: putfield      #44                 // Field f:I
      30: aload_0
      31: iconst_0
      32: putfield      #46                 // Field g:I
      35: aload_0
      36: iconst_0
      37: putfield      #48                 // Field h:I
      40: aload_0
      41: new           #50                 // class android/graphics/Rect
      44: dup
      45: invokespecial #53                 // Method android/graphics/Rect."<init>":()V
      48: putfield      #55                 // Field m:Landroid/graphics/Rect;
      51: return

  public android.support.design.widget.CoordinatorLayout$e(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #128                // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #36                 // Field b:Z
      10: aload_0
      11: iconst_0
      12: putfield      #38                 // Field c:I
      15: aload_0
      16: iconst_0
      17: putfield      #40                 // Field d:I
      20: aload_0
      21: iconst_m1
      22: putfield      #42                 // Field e:I
      25: aload_0
      26: iconst_m1
      27: putfield      #44                 // Field f:I
      30: aload_0
      31: iconst_0
      32: putfield      #46                 // Field g:I
      35: aload_0
      36: iconst_0
      37: putfield      #48                 // Field h:I
      40: aload_0
      41: new           #50                 // class android/graphics/Rect
      44: dup
      45: invokespecial #53                 // Method android/graphics/Rect."<init>":()V
      48: putfield      #55                 // Field m:Landroid/graphics/Rect;
      51: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #44                 // Field f:I
       4: ireturn

  void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #207                // Method a:(IZ)V
       6: return

  void a(int, boolean);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 1
                     0: 31
                     1: 25
               default: 24
          }
      24: return
      25: aload_0
      26: iload_2
      27: putfield      #209                // Field q:Z
      30: return
      31: aload_0
      32: iload_2
      33: putfield      #211                // Field p:Z
      36: return

  void a(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #55                 // Field m:Landroid/graphics/Rect;
       4: aload_1
       5: invokevirtual #215                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
       8: return

  public void a(android.support.design.widget.CoordinatorLayout$b);
    Code:
       0: aload_0
       1: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
       4: aload_1
       5: if_acmpeq     46
       8: aload_0
       9: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      12: ifnull        22
      15: aload_0
      16: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      19: invokevirtual #218                // Method android/support/design/widget/CoordinatorLayout$b.c:()V
      22: aload_0
      23: aload_1
      24: putfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      27: aload_0
      28: aconst_null
      29: putfield      #220                // Field n:Ljava/lang/Object;
      32: aload_0
      33: iconst_1
      34: putfield      #36                 // Field b:Z
      37: aload_1
      38: ifnull        46
      41: aload_1
      42: aload_0
      43: invokevirtual #125                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout$e;)V
      46: return

  void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #223                // Field r:Z
       5: return

  boolean a(android.support.design.widget.CoordinatorLayout, android.view.View);
    Code:
       0: aload_0
       1: getfield      #226                // Field o:Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #226                // Field o:Z
      13: istore        4
      15: aload_0
      16: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      19: ifnull        35
      22: aload_0
      23: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      26: aload_1
      27: aload_2
      28: invokevirtual #228                // Method android/support/design/widget/CoordinatorLayout$b.e:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Z
      31: istore_3
      32: goto          37
      35: iconst_0
      36: istore_3
      37: iload_3
      38: iload         4
      40: ior
      41: istore_3
      42: aload_0
      43: iload_3
      44: putfield      #226                // Field o:Z
      47: iload_3
      48: ireturn

  boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View);
    Code:
       0: aload_3
       1: aload_0
       2: getfield      #144                // Field l:Landroid/view/View;
       5: if_acmpeq     45
       8: aload_0
       9: aload_3
      10: aload_1
      11: invokestatic  #234                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      14: invokespecial #236                // Method a:(Landroid/view/View;I)Z
      17: ifne          45
      20: aload_0
      21: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      24: ifnull        43
      27: aload_0
      28: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
      31: aload_1
      32: aload_2
      33: aload_3
      34: invokevirtual #238                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
      37: ifeq          43
      40: goto          45
      43: iconst_0
      44: ireturn
      45: iconst_1
      46: ireturn

  public android.support.design.widget.CoordinatorLayout$b b();
    Code:
       0: aload_0
       1: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
       4: areturn

  android.view.View b(android.support.design.widget.CoordinatorLayout, android.view.View);
    Code:
       0: aload_0
       1: getfield      #44                 // Field f:I
       4: iconst_m1
       5: if_icmpne     20
       8: aload_0
       9: aconst_null
      10: putfield      #144                // Field l:Landroid/view/View;
      13: aload_0
      14: aconst_null
      15: putfield      #138                // Field k:Landroid/view/View;
      18: aconst_null
      19: areturn
      20: aload_0
      21: getfield      #138                // Field k:Landroid/view/View;
      24: ifnull        36
      27: aload_0
      28: aload_2
      29: aload_1
      30: invokespecial #242                // Method b:(Landroid/view/View;Landroid/support/design/widget/CoordinatorLayout;)Z
      33: ifne          42
      36: aload_0
      37: aload_2
      38: aload_1
      39: invokespecial #244                // Method a:(Landroid/view/View;Landroid/support/design/widget/CoordinatorLayout;)V
      42: aload_0
      43: getfield      #138                // Field k:Landroid/view/View;
      46: areturn

  boolean b(int);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 1
                     0: 31
                     1: 26
               default: 24
          }
      24: iconst_0
      25: ireturn
      26: aload_0
      27: getfield      #209                // Field q:Z
      30: ireturn
      31: aload_0
      32: getfield      #211                // Field p:Z
      35: ireturn

  android.graphics.Rect c();
    Code:
       0: aload_0
       1: getfield      #55                 // Field m:Landroid/graphics/Rect;
       4: areturn

  boolean d();
    Code:
       0: aload_0
       1: getfield      #138                // Field k:Landroid/view/View;
       4: ifnonnull     17
       7: aload_0
       8: getfield      #44                 // Field f:I
      11: iconst_m1
      12: if_icmpeq     17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  boolean e();
    Code:
       0: aload_0
       1: getfield      #117                // Field a:Landroid/support/design/widget/CoordinatorLayout$b;
       4: ifnonnull     12
       7: aload_0
       8: iconst_0
       9: putfield      #226                // Field o:Z
      12: aload_0
      13: getfield      #226                // Field o:Z
      16: ireturn

  void f();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #226                // Field o:Z
       5: return

  boolean g();
    Code:
       0: aload_0
       1: getfield      #223                // Field r:Z
       4: ireturn

  void h();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #223                // Field r:Z
       5: return
}
