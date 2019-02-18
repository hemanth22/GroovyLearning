workflow "Maven Project" {
  on = "push"
  resolves = ["GitHub Action for Slack"]
}

action "GitHub Action for Maven" {
  uses = "LucaFeger/action-maven-cli@9d8f23af091bd6f5f0c05c942630939b6e53ce44"
  args = "install -DskipTests=false"
}
