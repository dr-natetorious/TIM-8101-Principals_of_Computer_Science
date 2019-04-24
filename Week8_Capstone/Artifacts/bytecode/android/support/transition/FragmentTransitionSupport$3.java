class android.support.transition.FragmentTransitionSupport$3 implements android.support.transition.u$c {
  final java.lang.Object a;

  final java.util.ArrayList b;

  final java.lang.Object c;

  final java.util.ArrayList d;

  final java.lang.Object e;

  final java.util.ArrayList f;

  final android.support.transition.FragmentTransitionSupport g;

  android.support.transition.FragmentTransitionSupport$3(android.support.transition.FragmentTransitionSupport, java.lang.Object, java.util.ArrayList, java.lang.Object, java.util.ArrayList, java.lang.Object, java.util.ArrayList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #24                 // Field g:Landroid/support/transition/FragmentTransitionSupport;
       5: aload_0
       6: aload_2
       7: putfield      #26                 // Field a:Ljava/lang/Object;
      10: aload_0
      11: aload_3
      12: putfield      #28                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: aload         4
      18: putfield      #30                 // Field c:Ljava/lang/Object;
      21: aload_0
      22: aload         5
      24: putfield      #32                 // Field d:Ljava/util/ArrayList;
      27: aload_0
      28: aload         6
      30: putfield      #34                 // Field e:Ljava/lang/Object;
      33: aload_0
      34: aload         7
      36: putfield      #36                 // Field f:Ljava/util/ArrayList;
      39: aload_0
      40: invokespecial #39                 // Method java/lang/Object."<init>":()V
      43: return

  public void a(android.support.transition.u);
    Code:
       0: return

  public void b(android.support.transition.u);
    Code:
       0: return

  public void c(android.support.transition.u);
    Code:
       0: return

  public void d(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/Object;
       4: ifnull        23
       7: aload_0
       8: getfield      #24                 // Field g:Landroid/support/transition/FragmentTransitionSupport;
      11: aload_0
      12: getfield      #26                 // Field a:Ljava/lang/Object;
      15: aload_0
      16: getfield      #28                 // Field b:Ljava/util/ArrayList;
      19: aconst_null
      20: invokevirtual #44                 // Method android/support/transition/FragmentTransitionSupport.b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      23: aload_0
      24: getfield      #30                 // Field c:Ljava/lang/Object;
      27: ifnull        46
      30: aload_0
      31: getfield      #24                 // Field g:Landroid/support/transition/FragmentTransitionSupport;
      34: aload_0
      35: getfield      #30                 // Field c:Ljava/lang/Object;
      38: aload_0
      39: getfield      #32                 // Field d:Ljava/util/ArrayList;
      42: aconst_null
      43: invokevirtual #44                 // Method android/support/transition/FragmentTransitionSupport.b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      46: aload_0
      47: getfield      #34                 // Field e:Ljava/lang/Object;
      50: ifnull        69
      53: aload_0
      54: getfield      #24                 // Field g:Landroid/support/transition/FragmentTransitionSupport;
      57: aload_0
      58: getfield      #34                 // Field e:Ljava/lang/Object;
      61: aload_0
      62: getfield      #36                 // Field f:Ljava/util/ArrayList;
      65: aconst_null
      66: invokevirtual #44                 // Method android/support/transition/FragmentTransitionSupport.b:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      69: return
}
