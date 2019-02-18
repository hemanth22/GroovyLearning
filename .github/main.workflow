workflow "Maven Project" {
  on = "push"
  resolves = ["GitHub Action for Maven"]
}

action "GitHub Action for Maven" {
  uses = "LucaFeger/action-maven-cli@9d8f23af091bd6f5f0c05c942630939b6e53ce44"
  args = "install -DskipTests=false"
  resolves = ["Release"]
}
workflow "Release" {
  resolves = ["release linux/amd64"]
}

action "release linux/amd64" {
  uses = "ngs/go-release.action@v1.0.1"
  env = {
    GOOS = "linux"
    GOARCH = "amd64"
  }
  secrets = ["GITHUB_TOKEN"]
}
