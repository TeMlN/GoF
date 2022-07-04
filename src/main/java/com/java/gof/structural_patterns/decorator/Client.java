package com.java.gof.structural_patterns.decorator;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (true) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (true) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는것보다 재밌을 수가 없지...");
        client.writeComment("http://taemin.me");
    }
}
