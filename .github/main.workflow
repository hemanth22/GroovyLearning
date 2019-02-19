workflow "Maven Project" {
  on = "push"
  resolves = [
    "GitHub Action for Slack",
    "GitHub Action for Maven-1",
    "GitHub Action for Maven-2",
  ]
}

action "GitHub Action for Maven" {
  uses = "LucaFeger/action-maven-cli@9d8f23af091bd6f5f0c05c942630939b6e53ce44"
  args = "install -DskipTests=false"
}

action "GitHub Action for Slack" {
  uses = "Ilshidur/action-slack@8ffb16cd67d7b47d844a6889b4488db5cc523a98"
  needs = [
    "GitHub Action for Maven",
    "GitHub Action for Maven-1",
    "GitHub Action for Maven-2",
  ]
  args = "A new commit has been pushed."
  env = {
    SLACK_CHANNEL = "mygitrepos"
  }
  secrets = ["SLACK_WEBHOOK"]
}

action "GitHub Action for Maven-1" {
  uses = "LucaFeger/action-maven-cli@9d8f23af091bd6f5f0c05c942630939b6e53ce44"
  runs = "test"
}

action "GitHub Action for Maven-2" {
  uses = "LucaFeger/action-maven-cli@9d8f23af091bd6f5f0c05c942630939b6e53ce44"
  args = "package"
}
