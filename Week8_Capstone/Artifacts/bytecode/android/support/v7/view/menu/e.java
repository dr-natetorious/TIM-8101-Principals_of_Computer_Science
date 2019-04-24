final class android.support.v7.view.menu.e extends android.support.v7.view.menu.m implements android.support.v7.view.menu.o,android.view.View$OnKeyListener,android.widget.PopupWindow$OnDismissListener {
  final android.os.Handler a;

  final java.util.List<android.support.v7.view.menu.e$a> b;

  android.view.View c;

  boolean d;

  public android.support.v7.view.menu.e(android.content.Context, android.view.View, int, int, boolean);
    Code:
       0: aload_0
       1: invokespecial #65                 // Method android/support/v7/view/menu/m."<init>":()V
       4: aload_0
       5: new           #67                 // class java/util/ArrayList
       8: dup
       9: invokespecial #68                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #70                 // Field j:Ljava/util/List;
      15: aload_0
      16: new           #67                 // class java/util/ArrayList
      19: dup
      20: invokespecial #68                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #72                 // Field b:Ljava/util/List;
      26: aload_0
      27: new           #12                 // class android/support/v7/view/menu/e$1
      30: dup
      31: aload_0
      32: invokespecial #75                 // Method android/support/v7/view/menu/e$1."<init>":(Landroid/support/v7/view/menu/e;)V
      35: putfield      #77                 // Field k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      38: aload_0
      39: new           #14                 // class android/support/v7/view/menu/e$2
      42: dup
      43: aload_0
      44: invokespecial #78                 // Method android/support/v7/view/menu/e$2."<init>":(Landroid/support/v7/view/menu/e;)V
      47: putfield      #80                 // Field l:Landroid/view/View$OnAttachStateChangeListener;
      50: aload_0
      51: new           #16                 // class android/support/v7/view/menu/e$3
      54: dup
      55: aload_0
      56: invokespecial #81                 // Method android/support/v7/view/menu/e$3."<init>":(Landroid/support/v7/view/menu/e;)V
      59: putfield      #83                 // Field m:Landroid/support/v7/widget/ax;
      62: aload_0
      63: iconst_0
      64: putfield      #85                 // Field n:I
      67: aload_0
      68: iconst_0
      69: putfield      #87                 // Field o:I
      72: aload_0
      73: aload_1
      74: putfield      #89                 // Field e:Landroid/content/Context;
      77: aload_0
      78: aload_2
      79: putfield      #91                 // Field p:Landroid/view/View;
      82: aload_0
      83: iload_3
      84: putfield      #93                 // Field g:I
      87: aload_0
      88: iload         4
      90: putfield      #95                 // Field h:I
      93: aload_0
      94: iload         5
      96: putfield      #97                 // Field i:Z
      99: aload_0
     100: iconst_0
     101: putfield      #99                 // Field v:Z
     104: aload_0
     105: aload_0
     106: invokespecial #102                // Method k:()I
     109: putfield      #104                // Field q:I
     112: aload_1
     113: invokevirtual #110                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
     116: astore_1
     117: aload_0
     118: aload_1
     119: invokevirtual #116                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
     122: getfield      #121                // Field android/util/DisplayMetrics.widthPixels:I
     125: iconst_2
     126: idiv
     127: aload_1
     128: getstatic     #126                // Field android/support/v7/a/a$d.abc_config_prefDialogWidth:I
     131: invokevirtual #130                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
     134: invokestatic  #136                // Method java/lang/Math.max:(II)I
     137: putfield      #138                // Field f:I
     140: aload_0
     141: new           #140                // class android/os/Handler
     144: dup
     145: invokespecial #141                // Method android/os/Handler."<init>":()V
     148: putfield      #143                // Field a:Landroid/os/Handler;
     151: return

  static android.view.ViewTreeObserver a(android.support.v7.view.menu.e);
    Code:
       0: aload_0
       1: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
       4: areturn

  static android.view.ViewTreeObserver a(android.support.v7.view.menu.e, android.view.ViewTreeObserver);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #208                // Field y:Landroid/view/ViewTreeObserver;
       5: aload_1
       6: areturn

  static android.view.ViewTreeObserver$OnGlobalLayoutListener b(android.support.v7.view.menu.e);
    Code:
       0: aload_0
       1: getfield      #77                 // Field k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
       4: areturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #85                 // Field n:I
       4: iload_1
       5: if_icmpeq     28
       8: aload_0
       9: iload_1
      10: putfield      #85                 // Field n:I
      13: aload_0
      14: iload_1
      15: aload_0
      16: getfield      #91                 // Field p:Landroid/view/View;
      19: invokestatic  #379                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      22: invokestatic  #383                // Method android/support/v4/view/e.a:(II)I
      25: putfield      #87                 // Field o:I
      28: return

  public void a(android.os.Parcelable);
    Code:
       0: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_1
       1: aload_0
       2: aload_0
       3: getfield      #89                 // Field e:Landroid/content/Context;
       6: invokevirtual #387                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V
       9: aload_0
      10: invokevirtual #222                // Method f:()Z
      13: ifeq          22
      16: aload_0
      17: aload_1
      18: invokespecial #389                // Method c:(Landroid/support/v7/view/menu/h;)V
      21: return
      22: aload_0
      23: getfield      #70                 // Field j:Ljava/util/List;
      26: aload_1
      27: invokeinterface #304,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      32: pop
      33: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #392                // Method d:(Landroid/support/v7/view/menu/h;)I
       5: istore_3
       6: iload_3
       7: ifge          11
      10: return
      11: iload_3
      12: iconst_1
      13: iadd
      14: istore        4
      16: iload         4
      18: aload_0
      19: getfield      #72                 // Field b:Ljava/util/List;
      22: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
      27: if_icmpge     51
      30: aload_0
      31: getfield      #72                 // Field b:Ljava/util/List;
      34: iload         4
      36: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      41: checkcast     #20                 // class android/support/v7/view/menu/e$a
      44: getfield      #168                // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
      47: iconst_0
      48: invokevirtual #393                // Method android/support/v7/view/menu/h.b:(Z)V
      51: aload_0
      52: getfield      #72                 // Field b:Ljava/util/List;
      55: iload_3
      56: invokeinterface #396,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
      61: checkcast     #20                 // class android/support/v7/view/menu/e$a
      64: astore        5
      66: aload         5
      68: getfield      #168                // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
      71: aload_0
      72: invokevirtual #399                // Method android/support/v7/view/menu/h.b:(Landroid/support/v7/view/menu/o;)V
      75: aload_0
      76: getfield      #401                // Field d:Z
      79: ifeq          100
      82: aload         5
      84: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      87: aconst_null
      88: invokevirtual #406                // Method android/support/v7/widget/ay.b:(Ljava/lang/Object;)V
      91: aload         5
      93: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      96: iconst_0
      97: invokevirtual #408                // Method android/support/v7/widget/ay.b:(I)V
     100: aload         5
     102: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
     105: invokevirtual #410                // Method android/support/v7/widget/ay.e:()V
     108: aload_0
     109: getfield      #72                 // Field b:Ljava/util/List;
     112: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
     117: istore        4
     119: iload         4
     121: ifle          152
     124: aload_0
     125: getfield      #72                 // Field b:Ljava/util/List;
     128: iload         4
     130: iconst_1
     131: isub
     132: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     137: checkcast     #20                 // class android/support/v7/view/menu/e$a
     140: getfield      #412                // Field android/support/v7/view/menu/e$a.c:I
     143: istore_3
     144: aload_0
     145: iload_3
     146: putfield      #104                // Field q:I
     149: goto          160
     152: aload_0
     153: invokespecial #102                // Method k:()I
     156: istore_3
     157: goto          144
     160: iload         4
     162: ifne          241
     165: aload_0
     166: invokevirtual #413                // Method e:()V
     169: aload_0
     170: getfield      #415                // Field x:Landroid/support/v7/view/menu/o$a;
     173: ifnull        187
     176: aload_0
     177: getfield      #415                // Field x:Landroid/support/v7/view/menu/o$a;
     180: aload_1
     181: iconst_1
     182: invokeinterface #419,  3          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
     187: aload_0
     188: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
     191: ifnull        220
     194: aload_0
     195: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
     198: invokevirtual #424                // Method android/view/ViewTreeObserver.isAlive:()Z
     201: ifeq          215
     204: aload_0
     205: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
     208: aload_0
     209: getfield      #77                 // Field k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
     212: invokevirtual #428                // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
     215: aload_0
     216: aconst_null
     217: putfield      #208                // Field y:Landroid/view/ViewTreeObserver;
     220: aload_0
     221: getfield      #351                // Field c:Landroid/view/View;
     224: aload_0
     225: getfield      #80                 // Field l:Landroid/view/View$OnAttachStateChangeListener;
     228: invokevirtual #432                // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
     231: aload_0
     232: getfield      #434                // Field z:Landroid/widget/PopupWindow$OnDismissListener;
     235: invokeinterface #437,  1          // InterfaceMethod android/widget/PopupWindow$OnDismissListener.onDismiss:()V
     240: return
     241: iload_2
     242: ifeq          265
     245: aload_0
     246: getfield      #72                 // Field b:Ljava/util/List;
     249: iconst_0
     250: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     255: checkcast     #20                 // class android/support/v7/view/menu/e$a
     258: getfield      #168                // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
     261: iconst_0
     262: invokevirtual #393                // Method android/support/v7/view/menu/h.b:(Z)V
     265: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #415                // Field x:Landroid/support/v7/view/menu/o$a;
       5: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #91                 // Field p:Landroid/view/View;
       4: aload_1
       5: if_acmpeq     31
       8: aload_0
       9: aload_1
      10: putfield      #91                 // Field p:Landroid/view/View;
      13: aload_0
      14: aload_0
      15: getfield      #85                 // Field n:I
      18: aload_0
      19: getfield      #91                 // Field p:Landroid/view/View;
      22: invokestatic  #379                // Method android/support/v4/view/s.e:(Landroid/view/View;)I
      25: invokestatic  #383                // Method android/support/v4/view/e.a:(II)I
      28: putfield      #87                 // Field o:I
      31: return

  public void a(android.widget.PopupWindow$OnDismissListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #434                // Field z:Landroid/widget/PopupWindow$OnDismissListener;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #442,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #447,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          43
      19: aload_2
      20: invokeinterface #451,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #20                 // class android/support/v7/view/menu/e$a
      28: invokevirtual #173                // Method android/support/v7/view/menu/e$a.a:()Landroid/widget/ListView;
      31: invokevirtual #179                // Method android/widget/ListView.getAdapter:()Landroid/widget/ListAdapter;
      34: invokestatic  #454                // Method a:(Landroid/widget/ListAdapter;)Landroid/support/v7/view/menu/g;
      37: invokevirtual #457                // Method android/support/v7/view/menu/g.notifyDataSetChanged:()V
      40: goto          10
      43: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.u);
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #442,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #447,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          47
      19: aload_2
      20: invokeinterface #451,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #20                 // class android/support/v7/view/menu/e$a
      28: astore_3
      29: aload_1
      30: aload_3
      31: getfield      #168                // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
      34: if_acmpne     10
      37: aload_3
      38: invokevirtual #173                // Method android/support/v7/view/menu/e$a.a:()Landroid/widget/ListView;
      41: invokevirtual #461                // Method android/widget/ListView.requestFocus:()Z
      44: pop
      45: iconst_1
      46: ireturn
      47: aload_1
      48: invokevirtual #466                // Method android/support/v7/view/menu/u.hasVisibleItems:()Z
      51: ifeq          79
      54: aload_0
      55: aload_1
      56: invokevirtual #468                // Method a:(Landroid/support/v7/view/menu/h;)V
      59: aload_0
      60: getfield      #415                // Field x:Landroid/support/v7/view/menu/o$a;
      63: ifnull        77
      66: aload_0
      67: getfield      #415                // Field x:Landroid/support/v7/view/menu/o$a;
      70: aload_1
      71: invokeinterface #470,  2          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;)Z
      76: pop
      77: iconst_1
      78: ireturn
      79: iconst_0
      80: ireturn

  public void b(int);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #285                // Field r:Z
       5: aload_0
       6: iload_1
       7: putfield      #287                // Field t:I
      10: return

  public void b(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #99                 // Field v:Z
       5: return

  public android.os.Parcelable c();
    Code:
       0: aconst_null
       1: areturn

  public void c(int);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #289                // Field s:Z
       5: aload_0
       6: iload_1
       7: putfield      #291                // Field u:I
      10: return

  public void c(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #314                // Field w:Z
       5: return

  public void d();
    Code:
       0: aload_0
       1: invokevirtual #222                // Method f:()Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #70                 // Field j:Ljava/util/List;
      12: invokeinterface #442,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      17: astore_2
      18: aload_2
      19: invokeinterface #447,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      24: ifeq          43
      27: aload_0
      28: aload_2
      29: invokeinterface #451,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      34: checkcast     #147                // class android/support/v7/view/menu/h
      37: invokespecial #389                // Method c:(Landroid/support/v7/view/menu/h;)V
      40: goto          18
      43: aload_0
      44: getfield      #70                 // Field j:Ljava/util/List;
      47: invokeinterface #474,  1          // InterfaceMethod java/util/List.clear:()V
      52: aload_0
      53: aload_0
      54: getfield      #91                 // Field p:Landroid/view/View;
      57: putfield      #351                // Field c:Landroid/view/View;
      60: aload_0
      61: getfield      #351                // Field c:Landroid/view/View;
      64: ifnull        118
      67: aload_0
      68: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
      71: ifnonnull     79
      74: iconst_1
      75: istore_1
      76: goto          81
      79: iconst_0
      80: istore_1
      81: aload_0
      82: aload_0
      83: getfield      #351                // Field c:Landroid/view/View;
      86: invokevirtual #478                // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      89: putfield      #208                // Field y:Landroid/view/ViewTreeObserver;
      92: iload_1
      93: ifeq          107
      96: aload_0
      97: getfield      #208                // Field y:Landroid/view/ViewTreeObserver;
     100: aload_0
     101: getfield      #77                 // Field k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
     104: invokevirtual #481                // Method android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
     107: aload_0
     108: getfield      #351                // Field c:Landroid/view/View;
     111: aload_0
     112: getfield      #80                 // Field l:Landroid/view/View$OnAttachStateChangeListener;
     115: invokevirtual #484                // Method android/view/View.addOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
     118: return

  public void e();
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
       9: istore_1
      10: iload_1
      11: ifle          67
      14: aload_0
      15: getfield      #72                 // Field b:Ljava/util/List;
      18: iload_1
      19: anewarray     #20                 // class android/support/v7/view/menu/e$a
      22: invokeinterface #488,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
      27: checkcast     #490                // class "[Landroid/support/v7/view/menu/e$a;"
      30: astore_2
      31: iload_1
      32: iconst_1
      33: isub
      34: istore_1
      35: iload_1
      36: iflt          67
      39: aload_2
      40: iload_1
      41: aaload
      42: astore_3
      43: aload_3
      44: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      47: invokevirtual #491                // Method android/support/v7/widget/ay.f:()Z
      50: ifeq          60
      53: aload_3
      54: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      57: invokevirtual #410                // Method android/support/v7/widget/ay.e:()V
      60: iload_1
      61: iconst_1
      62: isub
      63: istore_1
      64: goto          35
      67: return

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
       9: istore_1
      10: iconst_0
      11: istore_3
      12: iload_3
      13: istore_2
      14: iload_1
      15: ifle          44
      18: iload_3
      19: istore_2
      20: aload_0
      21: getfield      #72                 // Field b:Ljava/util/List;
      24: iconst_0
      25: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      30: checkcast     #20                 // class android/support/v7/view/menu/e$a
      33: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      36: invokevirtual #491                // Method android/support/v7/widget/ay.f:()Z
      39: ifeq          44
      42: iconst_1
      43: istore_2
      44: iload_2
      45: ireturn

  public android.widget.ListView g();
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #494,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       9: ifeq          14
      12: aconst_null
      13: areturn
      14: aload_0
      15: getfield      #72                 // Field b:Ljava/util/List;
      18: aload_0
      19: getfield      #72                 // Field b:Ljava/util/List;
      22: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
      27: iconst_1
      28: isub
      29: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      34: checkcast     #20                 // class android/support/v7/view/menu/e$a
      37: invokevirtual #173                // Method android/support/v7/view/menu/e$a.a:()Landroid/widget/ListView;
      40: areturn

  protected boolean h();
    Code:
       0: iconst_0
       1: ireturn

  public void onDismiss();
    Code:
       0: aload_0
       1: getfield      #72                 // Field b:Ljava/util/List;
       4: invokeinterface #247,  1          // InterfaceMethod java/util/List.size:()I
       9: istore_2
      10: iconst_0
      11: istore_1
      12: iload_1
      13: iload_2
      14: if_icmpge     51
      17: aload_0
      18: getfield      #72                 // Field b:Ljava/util/List;
      21: iload_1
      22: invokeinterface #251,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      27: checkcast     #20                 // class android/support/v7/view/menu/e$a
      30: astore_3
      31: aload_3
      32: getfield      #404                // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      35: invokevirtual #491                // Method android/support/v7/widget/ay.f:()Z
      38: ifne          44
      41: goto          53
      44: iload_1
      45: iconst_1
      46: iadd
      47: istore_1
      48: goto          12
      51: aconst_null
      52: astore_3
      53: aload_3
      54: ifnull        65
      57: aload_3
      58: getfield      #168                // Field android/support/v7/view/menu/e$a.b:Landroid/support/v7/view/menu/h;
      61: iconst_0
      62: invokevirtual #393                // Method android/support/v7/view/menu/h.b:(Z)V
      65: return

  public boolean onKey(android.view.View, int, android.view.KeyEvent);
    Code:
       0: aload_3
       1: invokevirtual #501                // Method android/view/KeyEvent.getAction:()I
       4: iconst_1
       5: if_icmpne     20
       8: iload_2
       9: bipush        82
      11: if_icmpne     20
      14: aload_0
      15: invokevirtual #413                // Method e:()V
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn
}
