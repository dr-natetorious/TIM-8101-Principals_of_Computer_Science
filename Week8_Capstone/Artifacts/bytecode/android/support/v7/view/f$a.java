public class android.support.v7.view.f$a implements android.support.v7.view.b$a {
  final android.view.ActionMode$Callback a;

  final android.content.Context b;

  final java.util.ArrayList<android.support.v7.view.f> c;

  final android.support.v4.g.m<android.view.Menu, android.view.Menu> d;

  public android.support.v7.view.f$a(android.content.Context, android.view.ActionMode$Callback);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #25                 // Field b:Landroid/content/Context;
       9: aload_0
      10: aload_2
      11: putfield      #27                 // Field a:Landroid/view/ActionMode$Callback;
      14: aload_0
      15: new           #29                 // class java/util/ArrayList
      18: dup
      19: invokespecial #30                 // Method java/util/ArrayList."<init>":()V
      22: putfield      #32                 // Field c:Ljava/util/ArrayList;
      25: aload_0
      26: new           #34                 // class android/support/v4/g/m
      29: dup
      30: invokespecial #35                 // Method android/support/v4/g/m."<init>":()V
      33: putfield      #37                 // Field d:Landroid/support/v4/g/m;
      36: return

  public void a(android.support.v7.view.b);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/view/ActionMode$Callback;
       4: aload_0
       5: aload_1
       6: invokevirtual #60                 // Method b:(Landroid/support/v7/view/b;)Landroid/view/ActionMode;
       9: invokeinterface #66,  2           // InterfaceMethod android/view/ActionMode$Callback.onDestroyActionMode:(Landroid/view/ActionMode;)V
      14: return

  public boolean a(android.support.v7.view.b, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/view/ActionMode$Callback;
       4: aload_0
       5: aload_1
       6: invokevirtual #60                 // Method b:(Landroid/support/v7/view/b;)Landroid/view/ActionMode;
       9: aload_0
      10: aload_2
      11: invokespecial #69                 // Method a:(Landroid/view/Menu;)Landroid/view/Menu;
      14: invokeinterface #73,  3           // InterfaceMethod android/view/ActionMode$Callback.onCreateActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z
      19: ireturn

  public boolean a(android.support.v7.view.b, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/view/ActionMode$Callback;
       4: aload_0
       5: aload_1
       6: invokevirtual #60                 // Method b:(Landroid/support/v7/view/b;)Landroid/view/ActionMode;
       9: aload_0
      10: getfield      #25                 // Field b:Landroid/content/Context;
      13: aload_2
      14: checkcast     #76                 // class android/support/v4/c/a/b
      17: invokestatic  #79                 // Method android/support/v7/view/menu/q.a:(Landroid/content/Context;Landroid/support/v4/c/a/b;)Landroid/view/MenuItem;
      20: invokeinterface #83,  3           // InterfaceMethod android/view/ActionMode$Callback.onActionItemClicked:(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
      25: ireturn

  public android.view.ActionMode b(android.support.v7.view.b);
    Code:
       0: aload_0
       1: getfield      #32                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #87                 // Method java/util/ArrayList.size:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload_3
      12: if_icmpge     52
      15: aload_0
      16: getfield      #32                 // Field c:Ljava/util/ArrayList;
      19: iload_2
      20: invokevirtual #90                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #8                  // class android/support/v7/view/f
      26: astore        4
      28: aload         4
      30: ifnull        45
      33: aload         4
      35: getfield      #93                 // Field android/support/v7/view/f.b:Landroid/support/v7/view/b;
      38: aload_1
      39: if_acmpne     45
      42: aload         4
      44: areturn
      45: iload_2
      46: iconst_1
      47: iadd
      48: istore_2
      49: goto          10
      52: new           #8                  // class android/support/v7/view/f
      55: dup
      56: aload_0
      57: getfield      #25                 // Field b:Landroid/content/Context;
      60: aload_1
      61: invokespecial #96                 // Method android/support/v7/view/f."<init>":(Landroid/content/Context;Landroid/support/v7/view/b;)V
      64: astore_1
      65: aload_0
      66: getfield      #32                 // Field c:Ljava/util/ArrayList;
      69: aload_1
      70: invokevirtual #100                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      73: pop
      74: aload_1
      75: areturn

  public boolean b(android.support.v7.view.b, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/view/ActionMode$Callback;
       4: aload_0
       5: aload_1
       6: invokevirtual #60                 // Method b:(Landroid/support/v7/view/b;)Landroid/view/ActionMode;
       9: aload_0
      10: aload_2
      11: invokespecial #69                 // Method a:(Landroid/view/Menu;)Landroid/view/Menu;
      14: invokeinterface #103,  3          // InterfaceMethod android/view/ActionMode$Callback.onPrepareActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z
      19: ireturn
}
