class se.emilsjolander.stickylistheaders.StickyListHeadersListView$g implements se.emilsjolander.stickylistheaders.g$a {
  final se.emilsjolander.stickylistheaders.StickyListHeadersListView a;

  se.emilsjolander.stickylistheaders.StickyListHeadersListView$g(se.emilsjolander.stickylistheaders.StickyListHeadersListView, se.emilsjolander.stickylistheaders.StickyListHeadersListView$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method "<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)V
       5: return

  public void a(android.graphics.Canvas);
    Code:
       0: getstatic     #29                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        8
       5: if_icmpge     25
       8: aload_0
       9: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      12: aload_0
      13: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      16: invokestatic  #32                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.g:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Lse/emilsjolander/stickylistheaders/g;
      19: invokevirtual #37                 // Method se/emilsjolander/stickylistheaders/g.a:()I
      22: invokestatic  #40                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;I)V
      25: aload_0
      26: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      29: invokestatic  #43                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/view/View;
      32: ifnull        116
      35: aload_0
      36: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      39: invokestatic  #47                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.h:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Z
      42: ifeq          99
      45: aload_1
      46: invokevirtual #52                 // Method android/graphics/Canvas.save:()I
      49: pop
      50: aload_1
      51: iconst_0
      52: aload_0
      53: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      56: invokestatic  #56                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.i:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)I
      59: aload_0
      60: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      63: invokevirtual #59                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.getRight:()I
      66: aload_0
      67: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      70: invokevirtual #62                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.getBottom:()I
      73: invokevirtual #66                 // Method android/graphics/Canvas.clipRect:(IIII)Z
      76: pop
      77: aload_0
      78: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      81: aload_1
      82: aload_0
      83: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      86: invokestatic  #43                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/view/View;
      89: lconst_0
      90: invokestatic  #69                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Landroid/graphics/Canvas;Landroid/view/View;J)Z
      93: pop
      94: aload_1
      95: invokevirtual #72                 // Method android/graphics/Canvas.restore:()V
      98: return
      99: aload_0
     100: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
     103: aload_1
     104: aload_0
     105: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
     108: invokestatic  #43                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/view/View;
     111: lconst_0
     112: invokestatic  #75                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.b:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;Landroid/graphics/Canvas;Landroid/view/View;J)Z
     115: pop
     116: return
}
